
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import repository.CompetenceRepository;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = ( "/application-context.xml"))
public class TestCompetenceRepository {

	@Autowired
	private CompetenceRepository competence;
	
	
	@Test
	public void test() {
		Pageable firstPage= PageRequest.of(0, 2);
		System.out.println(competence.findAll(firstPage));	
		Page page=competence.findAll(firstPage);
		System.out.println(page.getContent().getClass());
		System.out.println(competence.findAll(page.nextPageable()));
		assertEquals(2,page.getContent().size());
		System.out.println(competence.findAllByNomContaining("h", firstPage));
		System.out.println(competence.findAll(Sort.by("nom")));//faire un tri
		System.out.println(competence.findAll());
		System.out.println(competence.findAll(Sort.by(Direction.DESC, "nom")));// mettre une direction pour trier par nom (ex)
	}

}
