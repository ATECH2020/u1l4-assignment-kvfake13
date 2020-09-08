import java.util.Scanner;

class Timestamps {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int hours1 = scanner.nextInt();
        int minutes1 = scanner.nextInt();
        int seconds1 = scanner.nextInt();
        int hours2 = scanner.nextInt();
        int minutes2 = scanner.nextInt();
        int seconds2 = scanner.nextInt();
        int total1; //total of first timestamp
        int total2; //total of second timestamp
        /*
         *  your code goes here
         */
        hours1 = hours1 * 3600; //turns hours into seconds
        minutes1 = minutes1 * 60; //converts minutes to seconds
        total1 = minutes1 + hours1 + seconds1; 
        //seconds of the first timestamp
        hours2 = hours2 * 3600; //turns hours into seconds
        minutes2 = minutes2 * 60; //converts minutes to seconds
        total2 = minutes2 + hours2 + seconds2;
        //seconds of second timestamp
        int diff = total2 - total1;
        //difference between two timestamps
        System.out.print(diff); //prints diff
       // closing the scanner object
        scanner.close();
    }
}