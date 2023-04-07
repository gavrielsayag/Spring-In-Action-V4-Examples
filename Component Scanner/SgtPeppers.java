package sound.system.cd.player;
import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisc {

	public void Play() 
	{
		System.out.println("playing sgt peppers by the beatles");

	}

}
