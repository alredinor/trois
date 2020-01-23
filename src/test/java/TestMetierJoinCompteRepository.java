import static org.junit.Assert.*;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import model.MetierJoinCompte;
import repository.MetierJoinCompteRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/application-context.xml"})
public class TestMetierJoinCompteRepository {
	
	@Autowired
	private MetierJoinCompteRepository metierJoinCompteRepository;

	@Test
	public void test() {
		
		Optional<MetierJoinCompte> opt=metierJoinCompteRepository.findById(1);
		assertFalse(opt.isPresent());
	}
	

}
