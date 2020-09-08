import java.util.Scanner;

class AnalogClock {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int hourDegree = scanner.nextInt();
        int degreeOfMins = ((hourDegree*2 % 60) * 6);
       System.out.print(degreeOfMins);


        // closing the scanner object
        scanner.close();
    }
} 