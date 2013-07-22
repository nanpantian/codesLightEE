package lee;

import org.crazyit.app.service.PersonService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest
{
	public static void main(String[] args)
	{
		//����Spring��ApplicationContext
		ApplicationContext ctx = new ClassPathXmlApplicationContext
		 ("bean.xml");
		//���Spring����
		System.out.println(ctx);
		PersonService p = ctx.getBean("personService" , PersonService.class);
		p.info();	
	}
}
