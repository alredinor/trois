
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import model.Personne;
import repository.PersonneRepository;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = ( "/application-context.xml"))
public class TestPersonneRepository {

	@Autowired
	private PersonneRepository moi;
	
	
	@Test
	public void test() {
		List<Personne> listePersonne=moi.findByPrenom("AAA");
		assertEquals(0,listePersonne.size());
	}
	
	@Test
	public void testPrenom() {
		assertEquals(0,moi.findByPrenomLike("%a%").size());
		assertEquals(0,moi.findByPrenom("alban").size());
	}
	@Test
	public void test2() {
		
	}
}
