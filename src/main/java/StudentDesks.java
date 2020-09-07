import java.util.Scanner;

class StudentDesks {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int classA = scanner.nextInt();
        int classB = scanner.nextInt();
        int classC = scanner.nextInt();
        int desksA;
        int desksB;
        int desksC;
        int total;
        /*
         *  your code goes here
         */
        if (classA % 2 == 0) {
          desksA = classA / 2;
        } else {
          desksA = (classA/2) + 1;
        }
        if (classB % 2 == 0) {
          desksB = classB / 2;
        } else {
          desksB = (classB/2) + 1;
        }
        if (classC % 2 == 0) {
          desksC = classC / 2;
        } else {
          desksC = (classC/2) + 1;
        }
        total = desksA + desksB + desksC;
        
        System.out.print(total);
        
        // closing the scanner object
        scanner.close();
    }
}