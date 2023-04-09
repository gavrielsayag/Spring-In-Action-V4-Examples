package sound.system.cd.player;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(sound.system.cd.player.SubConfig.class)
public class MainConfig {
	
	@Bean
	public CompactDisc HelloThisIsABeanForCompactDisc()
	{
		System.out.println("creating compact disc using java class conf - main  config");
		return new SgtPeppers();
	}
}
