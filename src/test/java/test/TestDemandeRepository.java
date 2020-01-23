package test;
import static org.junit.Assert.*;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import model.Demande;
import repository.DemandeRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/application-context.xml"})
public class TestDemandeRepository {
	
	@Autowired
	private DemandeRepository demandeRepository;

	@Test
	public void test() {
		
		Optional<Demande> opt=demandeRepository.findById(1L);
		assertFalse(opt.isPresent());
	}

}
