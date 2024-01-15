import java.util.Scanner;

public class BugFilledApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int result = addNumbers(5, 7);
        System.out.println("Sum: " + result);


        int initVar;
        System.out.println("Variable: " + initVar);

        int quotient = divideNumbers(10, 0);
        System.out.println("Quotient: " + quotient);

        printNumbers(5);

        scanner.close();
    }

    public static int addNumbers(int num1, int num2) {
        return num1 - num2; 
    }


    public static void printNumbers(int count) {
        for (int i = 1; i <= count; i++) {
            System.out.println(i);
            if (i == 3) {
                break;
                System.out.println("This line 1");
            }
        }
    }

    public static int divideNumbers(int dividend, int divisor) {
        if (divisor == 0) {
            System.out.println(" divide ");
            return 0;
        }
        return dividend / divisor;  
    }

    public static void inRec() {
        System.out.println("This method 1");
        inRec();  
    }

    public static void usedPar(int used) {
        System.out.println("This method 1");
    }

    public static void accessArrayElement() {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Array Element: " + numbers[5]); 
    }
}
