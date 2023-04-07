package sound.system.cd.player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class CDPlayer
{
	private CompactDisc cd;
	
	public CompactDisc getCd() {
		return cd;
	}

	public void setCd(CompactDisc cd) {
		this.cd = cd;
	}

	public CompactDisc GetDisc()
	{
		return this.cd;
	}
	
	public void Play()
	{
		System.out.println("I'm a cd player, lets play!");
		this.cd.Play();
	}
}
