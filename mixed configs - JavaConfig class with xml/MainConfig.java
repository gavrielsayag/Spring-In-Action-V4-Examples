package sound.system.cd.player;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:sub_config.xml")
public class MainConfig {
	
	@Bean
	public CompactDisc HelloThisIsABeanForCompactDisc()
	{
		System.out.println("creating compact disc using java class conf - main  config");
		return new SgtPeppers();
	}
}
