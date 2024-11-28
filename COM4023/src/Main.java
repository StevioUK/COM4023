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
            //1, add file, 2, remove song, 3, print list of all songs, 4, print list of all songs ranked on number of plays, 5 exit
            switch (option) {
                //Case 1 (Add file)
                case "1":
                    //Error handling try catch
                    try {
                        //Read User Input
                        System.out.print("Please enter the song name you'd like to add: ");
                        String songName = scanner.nextLine();
                        System.out.print("Please enter the artist name: ");
                        String artistName = scanner.nextLine();
                        System.out.print("Please enter the song plays (in number): ");
                        int songPlays = Integer.parseInt(scanner.nextLine());

                        //Add data to the list (first create a object)
                        songList.add(new addSong(songName,artistName,songPlays));
                        System.out.print("Song Successfully added!\n");
                    }
                    //If something goes wrong
                    catch (Exception e) {
                        System.out.print("Something went wrong, please try again. Select the option again\n");
                    }
                    break;
                //Case 2 (Remove file)
                case "2":
                    //Read user input after showing list of all entries
                    System.out.print("Please enter the song number you'd like to remove(use numbers):\n");

                    //Start a temp int variable for counting index of songs
                    int songCount = 0;
                    System.out.print("-----------------------------------------------------\n");
                    //Loop through list of songs and output index + song name. e.g (1 Friday)
                    for (addSong song : songList) {
                        songCount++;
                        System.out.print(Integer.toString(songCount)+" "+song.returnName()+"\n");
                    }
                    System.out.print("-----------------------------------------------------\n");

                    //Try catch error handling as user error can occur
                    try {
                        //Take user input as int
                        int removalID = Integer.parseInt(scanner.nextLine());

                        //Check if song is in the list of songs
                        if(songList.size() < removalID) {
                            songList.remove(removalID);
                        }

                    }
                    catch (Exception e) {
                        System.out.print("Something went wrong, please re-select the option and try again.\n");
                    }
                    break;

                //Case 3 (Show all songs saved in list)
                case "3":
                    System.out.print("-----------------------------------------------------\n");
                    //Loop through list of songs and output song name. e.g (Friday)
                    for (addSong song : songList) {
                        System.out.print(song.returnName()+"\n");
                    }
                    System.out.print("-----------------------------------------------------\n");
                    break;

                //Case 4 (print list of all songs ranked on number of plays)
                case "4":
                    // Create a copy of the song list to sort
                    ArrayList<addSong> sortedList = new ArrayList<>(songList);

                    // Sort the list in descending order of plays
                    sortedList.sort((song1, song2) -> Integer.compare(song2.returnPlayCount(), song1.returnPlayCount()));

                    // Print the sorted list
                    System.out.print("-----------------------------------------------------\n");
                    System.out.print("Songs ranked by number of plays:\n");
                    for (addSong song : sortedList) {
                        System.out.print(song.returnName() + " - " + song.returnPlayCount() + " (" + song.returnPlayCount() + " plays)\n");
                    }
                    System.out.print("-----------------------------------------------------\n");
                    break;

                // Case 5 (Exit)
                case "5":
                    System.out.print("Exiting the Music Player. Thank you for using the application!\n");
                    scanner.close(); // Close the Scanner to release resources
                    System.exit(0); // Exit the program
                    break;

            }
        }



    }
}