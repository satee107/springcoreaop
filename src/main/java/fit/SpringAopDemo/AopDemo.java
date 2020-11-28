package fit.SpringAopDemo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AopDemo {

	@Before("execution(public void Product.setPname(..))")
	public void beforesetname() {
		System.out.println("before the setter method exetion");
	}
	
	
	@Before("execution(public String Product.getPname())")
	public void beforegetname() {
		System.out.println("before the getter method exetion");
	}
}
