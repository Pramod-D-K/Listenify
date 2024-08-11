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

    public boolean findsong(String songname){
        for (Songs song:songlist){
            if(song.getSongname().equals(songname)) return true;
        }
        return false;
    }

    public String Addsongs(String songname, double duration){

        if(findsong(songname)==false){
            Songs newsong =new Songs(songname,duration);
            songlist.add(newsong);
             return "Song Added";
        }
        return "Song Already Exist";
    }


    public void addtoplaylist(int songno, List <Songs>playlist){
        int index =songno-1;
        if(index<=songlist.size()){
            Songs Song =songlist.get(index);
            for (Songs Songinplaylist:playlist){
                if(!Songinplaylist.getSongname().equals(Song)){

                        playlist.add(Song);
                        System.out.println(Song+" get added to playlist");
                        return;
                }
                System.out.println("Song already present in playlist");
                return;
            }
        }
        System.out.println("Song not present");
        return;
    }
    public void addtoplaylist(String songname, List <String>playlist){
        for (Songs listsong:songlist){
            //System.out.println(song);
            if(listsong.getSongname().equals(songname)){
                if(!playlist.contains(songname)){
                    playlist.add(songname);
                    System.out.println("Song added to playlist");
                    return;
                }
                System.out.println("Song Already exist");
                return;
            }
        }
        System.out.println("Song not exist in songlist");
    }


}

