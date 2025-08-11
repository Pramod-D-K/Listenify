package Spotify;

import java.util.*;

public class Main {
    private static int curIndex = 0;
    public static void display(){

        System.out.println("*** WELCOME TO SPOTIFY ***");
        System.out.println();

        System.out.println("1. Play Next Song");
        System.out.println("2. Play previous song");
        System.out.println("3. Repeat the song");
        System.out.println("4. Shuffle the PlayList");
        System.out.println("5. Delete Current song");
        System.out.println("6. Show Menu");
        System.out.println();//n
    }

    public static void show(List<Songs>list){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number  ");
        int n = sc.nextInt();
        switchcases(n,list);
        if(n>=7){
            return;
        }
        show(list);
    }
    public static void switchcases(int n, List<Songs>list){

        int l=list.size();
        switch (n){
            case 1:
                curIndex= (curIndex+1)%l;
                System.out.println("Current Playing song is "+ list.get(curIndex).getSongName());
                return;
            case 2:
                curIndex = (curIndex-1+l)%l;
                System.out.println("Current Playing song is "+ list.get(curIndex).getSongName());
                return;
            case 3:

                System.out.println("Current Playing song is "+ list.get(curIndex).getSongName());
                return;
            case 4:
                toShuffle(list);
                curIndex =0;
                System.out.println("Current Playing song is "+ list.get(curIndex).getSongName());
                return;
            case 5:
                System.out.println("Deleted song is1 "+ list.get(curIndex).getSongName());
                if(list.isEmpty()){
                    System.out.println("list is empty");
                    return;
                }
                curIndex = curIndex%l;
                System.out.println("Current Playing song is "+ list.get(curIndex).getSongName());
                return;
            case 6:
                display();
                return;
            case 7:
                for (Songs song: list){
                    System.out.println(song.getSongName());
                }
                return;
            case 8:
                System.out.println("Thank you");
                return;

            default:
                System.out.println("Wrong Number");
                return;
        }


    }
    public static void main(String[] args) {
        display();
        Scanner sc = new Scanner(System.in);
        Album vijay = new Album("KannadaSongs","Vijay Prakash");
        vijay.addSongToSongList("nanna bennalina",3.55);
        vijay.addSongToSongList("nanageega",3.45);
        vijay.addSongToSongList("maina kooge",3.55);

        Album pramod  = new Album("Kannada Songs","Pramod Gowda");
        pramod.addSongToSongList("Bangle bangari", 5.03);
        pramod.addSongToSongList("Googly", 4.03);
        pramod.addSongToSongList("Barisu kannada dim dimava", 5.03);

        List<Songs> myList = new ArrayList<>();
        pramod.addToPlayList(1, myList);
        pramod.addToPlayList("Googly", myList);
        vijay.addToPlayList(1, myList);


        System.out.println("Current Playing Song  "+ myList.get(0).getSongName());
        show(myList);




    }
    public static void toShuffle(List<Songs>list){
        Collections.shuffle(list);
        System.out.println("Shuffled the current playList");
    }
}
