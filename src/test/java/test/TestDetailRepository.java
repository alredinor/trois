package test;

import static org.junit.Assert.assertFalse;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import model.Demande;
import model.Detail;
import model.DetailPK;
import model.Service;
import repository.DetailRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/application-context.xml"})
public class TestDetailRepository {
	
	@Autowired
	private DetailRepository detailRepository;

	@Test
	public void test() {
		
//		Demande d=new Demande();
//		Service s=new Service();
//		DetailPK key=new DetailPK(d, s);
//		Optional<Detail> opt=detailRepository.findById(key);
//		assertFalse(opt.isPresent());
		
	}

}
