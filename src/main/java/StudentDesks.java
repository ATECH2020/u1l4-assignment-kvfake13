import java.util.Scanner;

class StudentDesks {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int classA = scanner.nextInt();
        int classB = scanner.nextInt();
        int classC = scanner.nextInt();
        int total;
        /*
         *  your code goes here
         */
        int temp1 = classA + classB + classC;
        double temp = Math.ceil(temp1 / 2.0);
        total = (int)temp;
        System.out.print(total);
        
        // closing the scanner object
        scanner.close();
    }
}