import java.util.Scanner;

class SecondsPastMidnight {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads int from user
        int seconds = scanner.nextInt();
        int hours;
        int mins;
        //Your code goes here
        hours = seconds / 3600; //converts to hours
        mins = seconds / 60; //converts to mins
        System.out.print(hours + " " + mins);
        // closing the scanner object
        scanner.close();
    }
}