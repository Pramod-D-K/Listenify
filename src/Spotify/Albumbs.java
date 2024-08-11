package Spotify;
import java.util.ArrayList;
import java.util.List;
public class Albumbs {

    private String singername;
    private String Albumbname;
    private List<Songs> songlist;

    public Albumbs(String singername, String albumbname) {
        this.singername = singername;
        this.Albumbname = albumbname;
        songlist=new ArrayList<>();
    }

    public boolean findsong(String songname, List<Songs> newlist){
        for (Songs song:newlist){
            if(song.getSongname().equals(songname)) return true;
        }
        return false;
    }

    public String Addsongs(String songname, double duration){

        if(findsong(songname,songlist)==false){
            Songs newsong =new Songs(songname,duration);
            songlist.add(newsong);
             return "Song Added";
        }
        return "Song Already Exist";
    }

    public void addtoplaylist(int songno, List<Songs>playlist){
        int index =songno-1;
        if(index<=songlist.size()){
            Songs Song =songlist.get(index);
            if(findsong(Song.getSongname(),playlist)==false){
                    playlist.add(Song);
                    //System.out.println(Song.getSongname()+" added to playlist");
                    return;
                }
                //System.out.println("Song already present in playlist");
                return;
            }
        //System.out.println("Song not present");
        return;
    }
    public void addtoplaylist(String songname, List <Songs>playlist){
        for (Songs listsong:songlist){
            if(listsong.getSongname().equals(songname)){
                if(findsong(songname,playlist)==false){
                    playlist.add(listsong);
                    //System.out.println(songname+"Song added to playlist");
                    return;
                }
                //System.out.println("Song Already exist");
                return;
            }
        }
        //System.out.println("Song not exist in songlist");
    }
}

