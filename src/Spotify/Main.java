package Spotify;
import java.util.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Albumbs Sonu =new Albumbs("Sonu Nigam", "Kannada Songs");
        Sonu.Addsongs("ondu mujane", 3.50);
        Sonu.Addsongs("paravasha nadenu", 4.10);
        Sonu.Addsongs("midiva ninna", 3.30);

        Albumbs Argit =new Albumbs("Argith Singh", "Hindi Songs");
        Argit.Addsongs("o maahi", 4.20);
        Argit.Addsongs("sajni", 4.40);
        Argit.Addsongs("heeriye", 3.40);

        List<String> playlist =new ArrayList();


        Sonu.addtoplaylist("ondu mujane", playlist);
        Sonu.addtoplaylist("ondu mujane", playlist);
//        for(String song:playlist){
//            System.out.println(song);
//        }



    }
}