package sound.system.cd.player;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Scope;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;

@Configuration
@EnableAspectJAutoProxy
public class TryConfig {
	@Bean("UniqueTry")
	public Try GetTryBean()
	{
		return new Try();
	}
	
	@Bean LogUsingAspect LogUsingAspectBean()
	{
		return new LogUsingAspect();
	}

}
