
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.DaoSalle;
import model.Salle;



public class Junit1 {

//	@Test
//	public void test() {
		//fail("Not yet implemented"); // fait echouer le test
		
//		String s="oui";
//		Assert.assertNotNull(s);
//	}
//	@Test
//	public void test2() {
//		String vide="non";
//		Assert.assertNotNull(vide);
//	}
	private static ClassPathXmlApplicationContext ctx;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception{
		 ctx = new ClassPathXmlApplicationContext ("application-context.xml");
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception{
		ctx.close();
	}
		
	@Before
	public void methodeBefore() {
		System.out.println("before");
	}
	
	@After
	public void methodeBAfter() {
		System.out.println("After");
	}
	@Test
	public void recuperationDaoSalle() {
		//fail("Not yet implemented"); // fait echouer le test
		
		Assert.assertNotNull(ctx.getBean(DaoSalle.class));
	}
	   @Test
	    public void insertSalle() {
	        DaoSalle daoSalle=ctx.getBean(DaoSalle.class);
	        Salle s=new Salle();
	        daoSalle.insert(s);
	        assertNotNull(daoSalle.findByKey(s.getNom()));
	        daoSalle.delete(s);
	        assertNull(daoSalle.findByKey(s.getNom()));
	    }
}
