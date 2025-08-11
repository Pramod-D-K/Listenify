package Spotify;

public class Songs {
    private String songName;
    private double songDuration;

    public Songs(String songName, double songDuration) {
        this.songName = songName;
        this.songDuration = songDuration;

    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public double getSongDuration() {
        return songDuration;
    }
    public String toString(){
        return "Song { " + "\"song title\" --->"+ songName+ "    \"song duration  \"---->" + songDuration+"}";
    }
}
