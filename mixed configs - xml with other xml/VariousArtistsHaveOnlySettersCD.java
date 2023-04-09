package sound.system.cd.player;

import java.util.List;

public class VariousArtistsHaveOnlySettersCD implements CompactDisc {
	List<String> artistsNames;
	public VariousArtistsHaveOnlySettersCD(List<String> artistsNames, String albumName, int numOfSongs) {
		this.artistsNames = artistsNames;
		this.albumName = albumName;
		this.numOfSongs = numOfSongs;
	}

	String albumName;
	int numOfSongs;
	
	public void Play() {
		System.out.println("playing " + this.numOfSongs + " songs " + "from the album \"" + this.albumName + "\" which includes " + this.artistsNames);
		
	}

}
