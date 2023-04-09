package sound.system.cd.player;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
@Conditional(sound.system.cd.player.CondToCheck.class)
public class CondConfig {
	@Bean
	public SgtPeppers HelloHello()
	{
		return new SgtPeppers();
	}
}
