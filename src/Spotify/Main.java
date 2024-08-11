package Spotify;
import java.util.*;
import java.util.ArrayList;

public class Main {



    public static void main(String[] args) {
        Albumbs Sonu =new Albumbs("Sonu Nigam", "Kannada Songs");
        Sonu.Addsongs("ondu mujane", 3.50);
        Sonu.Addsongs("paravasha nadenu", 4.10);
        Sonu.Addsongs("midiva ninna", 3.30);

        Albumbs Argith =new Albumbs("Argith Singh", "Hindi Songs");
        Argith.Addsongs("o maahi", 4.20);
        Argith.Addsongs("sajni", 4.40);
        Argith.Addsongs("heeriye", 3.40);

        List<Songs> playlist =new ArrayList();
        Sonu.addtoplaylist("ondu mujane", playlist);
        Sonu.addtoplaylist("ondu mujane", playlist);
        Argith.addtoplaylist(1,playlist);
        Argith.addtoplaylist(2,playlist);
        Argith.addtoplaylist(3,playlist);

        System.out.println("\"Wellcome to Listenify\"");

        int cursongindex =0;
        System.out.println("Now Playing "+playlist.get(cursongindex).toString());
        printMenu();
        startPlaylist(playlist);

    }

    public static void startPlaylist(List<Songs>playlist){
        Scanner sc =new Scanner(System.in);
        int cursongindex = 0;

        boolean quiteApplication =false;
        while(quiteApplication==false){
            System.out.println("Select the Option");
            int choice =sc.nextInt();
            switch(choice){
                case 1:
                    cursongindex =cursongindex+1;
                    if(cursongindex==playlist.size())cursongindex=0;
                    System.out.println("Now Playing "+playlist.get(cursongindex).toString());
                    break;
                case 2:
                    cursongindex =cursongindex-1;
                    if(cursongindex==-1)cursongindex=0;
                    System.out.println("Now Playing "+playlist.get(cursongindex).toString());
                    break;
                case 3:
                    System.out.println("Now Playing "+playlist.get(cursongindex).toString());
                    break;
                case 4:
                    Collections.shuffle(playlist);
                    System.out.println("Now Playing "+playlist.get(0).toString());
                    break;
                case 5:
                    int curtemp =0;
                    if(cursongindex!=playlist.size()-1){
                        curtemp =cursongindex;
                    }
                    playlist.remove(cursongindex);

                    if(playlist.size()==0){
                        quiteApplication=true;
                       return;
                    }
                    System.out.println("Now Playing "+playlist.get(curtemp).toString());
                    break;
                case 6:
                    printMenu();
                    break;
                case 7:
                    printplaylist(playlist);
                case 8:
                    quiteApplication=true;
                    System.out.println("\"Thank You\"");
                    System.out.println("\"Exited\"");
                    break;
                default:
                    System.out.println("Wrong InPut");
            }
        }
    }
    public static void printplaylist(List<Songs>playlist){
        for (Songs song:playlist){
            System.out.println(song.toString());
        }
    }
    public static  void printMenu(){
        System.out.println("1. Play Next Song");
        System.out.println("2. Play Previous Song");
        System.out.println("3. Repeat the Song");
        System.out.println("4. Shuffle the Song");
        System.out.println("5. Delete Current Song");
        System.out.println("6. Print the Menu");
        System.out.println("7. Print PlayList");
        System.out.println("8. Exit the Application");
    }
}