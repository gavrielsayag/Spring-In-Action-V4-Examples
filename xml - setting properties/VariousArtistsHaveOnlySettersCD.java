package sound.system.cd.player;

import java.util.List;

public class VariousArtistsHaveOnlySettersCD implements CompactDisc {
	List<String> artistsNames;
	String albumName;
	int numOfSongs;
	
	public List<String> getArtistsNames() {
		return artistsNames;
	}
	public void setArtistsNames(List<String> artistsNames) {
		this.artistsNames = artistsNames;
	}
	public String getAlbumName() {
		return albumName;
	}
	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}
	public int getNumOfSongs() {
		return numOfSongs;
	}
	public void setNumOfSongs(int numOfSongs) {
		this.numOfSongs = numOfSongs;
	}
	public void Play() {
		System.out.println("playing " + this.numOfSongs + " songs " + "from the album \"" + this.albumName + "\" which includes " + this.artistsNames);
		
	}

}
