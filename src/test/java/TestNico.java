import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Artisan;
import model.Compte;
import repository.CompteRepository;

public class TestNico {

	public static void main(String[] args) {
	
		ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("application-context.xml");
	
		CompteRepository compteRepository = null;
		Compte a=new Artisan();
		a.setLogin("toto");
		compteRepository.save(a);
		
		ctx.close();
}
}
