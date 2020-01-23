import static org.junit.Assert.*;

import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import model.Compte;
import model.MetierJoinCompte;
import repository.MetierJoinCompteRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/application-context.xml"})
public class TestMetierJoinCompteRepository 
{
	
	@Autowired
	private MetierJoinCompteRepository metierJoinCompteRepository;

	@Test
	public void test() 
	{	
		Optional<MetierJoinCompte> opt=metierJoinCompteRepository.findById(1L);
		assertFalse(opt.isPresent());
	}
	
	
//	Compte c = new Compte();
//	
//	public void testCompte()
//	{
//		List <MetierJoinCompte> ListeMjc = metierJoinCompteRepository.findByCompte(c);
//		assertEquals(0,ListeMjc.size());
//	}
	

}
