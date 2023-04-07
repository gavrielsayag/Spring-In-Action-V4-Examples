package sound.system.cd.player;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
public class CDPlayerJavaConfig 
{
	@Bean
	public CompactDisc HelloThisIsABeanForCompactDisc()
	{
		System.out.println("creating compact disc using java class conf");
		return new SgtPeppers();
	}
	
	@Bean CDPlayer foo()
	{
		System.out.println("creating cd player using java class conf");
		return new CDPlayer(HelloThisIsABeanForCompactDisc());
	}

}
