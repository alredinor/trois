
import static org.junit.Assert.*;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import model.Salle;
import repository.SalleRepository;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = ( "/application-context.xml"))
public class TestSalleRepository {

	@Autowired
	private SalleRepository moi;
	
	
	@Test
	public void test() {
		Optional<Salle> opt=moi.findById("AAA");
		assertFalse(opt.isPresent());
	}

}
