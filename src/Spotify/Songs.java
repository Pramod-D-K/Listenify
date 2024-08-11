package Spotify;

public class Songs {

    private String songname;
    private double duration;

    public Songs(String songname, double duration) {
        this.songname = songname;
        this.duration = duration;
    }
    public double getDuration() {
        return duration;
    }
    public String getSongname() {
        return songname;
    }
}
