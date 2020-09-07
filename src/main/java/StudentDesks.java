import java.util.Scanner;

class StudentDesks {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int classA = scanner.nextInt();
        int classB = scanner.nextInt();
        int classC = scanner.nextInt();
        int totalDesks;
        int totalStudents;
        /*
         *  your code goes here
         */
        totalStudents = classA + classB + classC;
        if (totalStudents % 2 == 1) {
          totalDesks = (classA + classB + classC + 1) /2;
          System.out.print(totalDesks);
        }
        else {
          totalDesks = (classA + classB + classC) /2;
          System.out.print(totalDesks);
        }
        
        
        // closing the scanner object
        scanner.close();
    }
}