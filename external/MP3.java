package sound.system.cd.player;

public class MP3 {
	String name;
	String album;
	String dontGiveMeVal;
	
	public MP3(String name, String album, String dontGiveMeVal) {
		this.name = name;
		this.album = album;
		this.dontGiveMeVal = dontGiveMeVal;
	}
	
	public void display()
	{
		System.out.println("name - " + this.name + ", album - " + this.album + " , dontGiveMeVal - " + this.dontGiveMeVal);
	}
}
