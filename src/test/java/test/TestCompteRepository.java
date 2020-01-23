package test;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import repository.CompteRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = ( "/application-context.xml"))
public class TestCompteRepository 
{
	@Autowired
	private CompteRepository compte;
	
	@Test
	public void testId()
	{
		assertEquals(0,compte.findById(2L));
	}
	
}
