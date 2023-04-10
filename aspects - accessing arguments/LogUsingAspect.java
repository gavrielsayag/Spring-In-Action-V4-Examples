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
	
	@Before("execution (** sound.system.cd.player.Try.Display(int,..)) && args(thisIsTheInt,..)")
	public void AroundDisplay(int thisIsTheInt)
	{
		System.out.println("******\nbefore executing with int " + thisIsTheInt);
		System.out.println(thisIsTheInt + " + " + (thisIsTheInt + 1) + " = " + (thisIsTheInt + thisIsTheInt +1));
		
	}
}
