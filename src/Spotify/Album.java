package Spotify;

import java.util.ArrayList;
import java.util.List;

public class Album {
    private String albumName;
    private String artistName;

    private List<Songs> songList;
//    public Album(){
//
//        songList=new ArrayList<>();
//    }
    public Album(String albumName, String artistName) {
        this.albumName = albumName;
        this.artistName = artistName;
        songList=new ArrayList<>();

    }

    public boolean isTrue(String songName){
        for (Songs song: songList){
            if(song.getSongName().equals(songName)){
                return true;
            }
        }
        return false;
    }
    public Songs findSong(String songName){
        for (Songs song: songList){
            if(song.getSongName().equals(songName)){
                return song;
            }
        }
        return new Songs("",0.0);
    }

    public String checkSong(String songName){
        if(isTrue( songName))
            return "Song present in your Album";
        else
            return "Song not present in your Album";

    }

    //add songs to the songlist;
    public void addSongToSongList(String songName,double songDuration){
        if(isTrue(songName)==false){
            songList.add(new Songs(songName,songDuration));

        }else{
            System.out.println(songName +"song already exist");
        }
    }
    //add to custom playlist by song number of songList;
    public void addToPlayList(int songNo, List<Songs>playList){
        int index = songNo-1;
        if(index>=0&&index<=songList.size()-1){
            playList.add(songList.get(index));
        }else{
            System.out.println("give proper song number");
        }
    }

    //add to custom playList by song Name
    public void addToPlayList(String songName, List<Songs>playList){

        if(isTrue(songName)){
            Songs s = findSong(songName);
            playList.add(s);
        }else{
            System.out.println(songName +" this song not present in your songList");
        }
    }


}
