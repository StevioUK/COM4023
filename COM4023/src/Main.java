import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<addSong> songList = new ArrayList<>();
        //PRE-ADD SONGS FOR TESTING
        songList.add(new addSong("Saturday","Taylor Swift",193));
        songList.add(new addSong("Monday","Taylor Swift",222));
        songList.add(new addSong("Friday","Taylor Swift",3452));
        songList.add(new addSong("Video Games","Lana Del Rey",235262));
        songList.add(new addSong("Yellow","Mikey Smith",634637));
        //Print all the initial options and menu
        System.out.print("Welcome to the Music Player!\n");
        System.out.print("You have 5 options to choose from: \n");
        System.out.print("1. Add a new song to list\n");
        System.out.print("2. Remove a song from list\n");
        System.out.print("3. Show a list of all songs saved\n");
        System.out.print("4. Show a list of all songs ranked by plays\n");
        System.out.print("5. Exit\n");

        //Record all responses
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Please enter the option you would like to use: ");
            String option = scanner.nextLine();
            //1, add file, 2, remove song, 3, print list of all songs, 4, print list of all songs ranked on number of plays
            switch (option) {
                case "1":
                    try {
                        System.out.print("Please enter the song name you'd like to add: ");
                        String songName = scanner.nextLine();
                        System.out.print("Please enter the artist name: ");
                        String artistName = scanner.nextLine();
                        System.out.print("Please enter the song plays (in number): ");
                        int songPlays = Integer.parseInt(scanner.nextLine());

                        songList.add(new addSong(songName,artistName,songPlays));
                        System.out.print("Song Successfully added!\n");
                    }
                    catch (Exception e) {
                        System.out.print("Something went wrong, please try again. Select the option again\n");
                    }

                case "2":
                    System.out.print("Please enter the song name you'd like to remove: ");

                case "3":
                    for (item in songList.size()) {
                        System.out.print(song+"\n");
                    }

                case "4":
                    System.out.print("Please enter the song name you'd like to remove: ");
            }
        }



    }
}