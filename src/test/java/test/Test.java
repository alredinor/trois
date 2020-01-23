package test;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@Configurable
@ComponentScan("model")
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext ("application-context.xml");

//		Properties properties = new Properties();
//		try {
//			properties.load(new FileInputStream("config.properties"));
//			
//		} catch (FileNotFoundException e){
//			e.printStackTrace();
//		} catch (IOException e)
//		{
//			e.printStackTrace();
//		}
//		System.out.println(properties.get(key));
		
		//DaoSalle daoSalle = (DaoSalle) ctx.getBean("daoSalleJpaImp");

		ctx.close();

	}
	// METHODE
	/*
	 * Public class Test (){
	 * 
	 * @Bean public DataSource dataSource() { BasicDataSource dataSource = new
	 * BasicDataSource(); dataSource.setDriverClassName("org.postgresql.Driver");
	 * dataSource.setUsername("postgres"); dataSource.setPassword("root");
	 * dataSource.setMaxTotal(10); dataSource.setInitialSize(5);
	 * dataSource.setUrl("jdbc:postgresql://127.0.0.1:5432/jpa"); return
	 * dataSource();}
	 */

	/*
	 * @Bean public EntityManagerFactory entityManagerFactory() {
	 * 
	 * LocalContainerEntityManagerFactoryBean emf=new
	 * LocalContainerEntityManagerFactoryBean(); emf.setDataSource(dataSource());
	 * //set... return emf; } }
	 *
	 */

}
