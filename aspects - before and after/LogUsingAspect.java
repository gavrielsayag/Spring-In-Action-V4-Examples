package sound.system.cd.player;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogUsingAspect {
	
	@Pointcut("execution (** sound.system.cd.player.Try.Display(..))")
	public void MyName()
	{}
	
	@Before("MyName()")
	public void BeforeAnyDisplay()
	{
		System.out.println("***\nhello, this is an advice that happens before any call to display");
	}
	
	@After("MyName()")
	public void AfterAnyDisplay()
	{
		System.out.println("hello, this is an advice that happens after call to display");
	}
	
	@After("execution (** sound.system.cd.player.Try.Display(int,..))")
	public void AfterIntDisplay()
	{
		System.out.println("I have to say, I'm so happy that you gave me number");
	}

}
