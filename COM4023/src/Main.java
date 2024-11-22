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
            switch (option) {
                case "1":
            }
        }



    }
}