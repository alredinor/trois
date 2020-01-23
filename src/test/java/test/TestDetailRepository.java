package test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import model.Detail;
import repository.DetailRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/application-context.xml"})
public class TestDetailRepository {
	
	@Autowired
	private DetailRepository detailRepository;

	@Test
	public void test() {
		
		List<Detail> opt=detailRepository.findByStatut("o");
		//assertFalse(opt.isPresent());
		
	}

}
