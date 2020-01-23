package test;
import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import model.Metier;
import repository.MetierRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = ( "/application-context.xml"))
public class TestMetierRepository 
{
	@Autowired
	private MetierRepository metier;
	
	@Test
	public void test() 
	{
		List<Metier> listeMetier=metier.findByTitreMetier("Menuisier");
		assertEquals(0,listeMetier.size());
	}
}
