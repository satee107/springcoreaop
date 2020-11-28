package fit.SpringAopDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Working....!" );
        
    	ApplicationContext context = new ClassPathXmlApplicationContext(
 				"applicationcontext.xml");
    	Product product = (Product)context.getBean("product");
    	
    	product.setPname("TV");
    	System.out.println("Product Name: "+product.getPname());
    }
}
