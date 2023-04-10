package sound.system.cd.player;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;

@Configuration
public class TryConfig {
	@Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public Try GetTryBean()
	{
		return new Try();
	}

}
