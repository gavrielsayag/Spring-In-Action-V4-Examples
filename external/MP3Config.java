package sound.system.cd.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:app.properties")
public class MP3Config {
	@Autowired
	 Environment env;
	
	@Bean
	public MP3 myMp3()
	{
		return new MP3(env.getRequiredProperty("mp3.name"), env.getRequiredProperty("mp3.album"), env.getProperty("mp3.dontGiveMeVal", "this is default") );
	}

}
