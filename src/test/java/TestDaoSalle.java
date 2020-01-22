import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import dao.DaoSalle;
import model.Salle;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = ( "/application-context.xml"))
public class TestDaoSalle {

	@Autowired
	private DaoSalle daoSalle;
	
	
	
	@Test
	public void test() {
		assertNotNull(daoSalle);
	}

	   @Test
	   @Transactional
	   @Rollback(true)
	    public void insertSalle() {
	        
	        Salle s=new Salle();
	        s.setNom("azure");
	        assertNotNull(daoSalle.findByKey(s.getNom()));
	        daoSalle.insert(s);
	    }
	   @Test(expected=Exception.class)
		public void findWazaaa() {
			daoSalle.findByKeyWithPersonnes("azure");
		}
}
