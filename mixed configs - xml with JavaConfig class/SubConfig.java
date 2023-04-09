package sound.system.cd.player;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SubConfig {
	@Bean 
	CDPlayer foo(CompactDisc compact)
	{
		System.out.println("creating cd player using java class conf - sub config, the main is xml");
		return new CDPlayer(compact);
	}

}
