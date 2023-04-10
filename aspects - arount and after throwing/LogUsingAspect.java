package sound.system.cd.player;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogUsingAspect {
	
	@Pointcut("execution (** sound.system.cd.player.Try.Display(..))")
	public void MyName()
	{}
	
	@Around("MyName()")
	public void AroundDisplay(ProceedingJoinPoint jp)
	{
		System.out.println("******\nbefore executing");
		try
		{
			jp.proceed();
		}
		catch (Throwable e) {
			System.out.println("we caught the exception inside the around advice");
		}
		
		System.out.println("after\n******");
	}
	
	@AfterThrowing("MyName()")
	public void ThrowingDisplay()
	{
		System.out.println("@AfterThrowing@AfterThrowing@AfterThrowing");
	}
}
