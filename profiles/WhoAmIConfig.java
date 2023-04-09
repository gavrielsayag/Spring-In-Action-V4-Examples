package sound.system.cd.player;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class WhoAmIConfig {
	
	@Bean
	@Profile("dev")
	public WhoAmI whoAmIDev()
	{
		return new WhoAmI("I am dev");
	}
	
	@Bean
	@Profile("prod")
	public WhoAmI whoAmIProd()
	{
		return new WhoAmI("I am prod");
	}

}
