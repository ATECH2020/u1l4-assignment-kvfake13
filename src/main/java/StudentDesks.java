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
        double class1 = classA / 2.0;
        double class2 = classB / 2.0; 
        double class3 = classC / 2.0;        
        double temp1 = class1 + class2 + class3;
        double temp = Math.ceil(temp1);
        total = (int)temp;
        System.out.print(total);
        
        // closing the scanner object
        scanner.close();
    }
}