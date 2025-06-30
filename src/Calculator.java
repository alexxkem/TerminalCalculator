import java.util.Scanner;


public class Calculator {
    public static void main(String[] args) {

        //Loops the Calculator
        while(true) {

            //Ask users for numbers input
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your first Number: ");
            double firstNumber = scanner.nextDouble();
            System.out.println("Enter your second Number");
            double secondNumber = scanner.nextDouble();

            //Ask users for operations
            System.out.println("What Operation would you like to do? (+, -, *, /, %, ^)");
            String operation = scanner.next();
            if (operation.equals("+")) {
                double total = firstNumber + secondNumber;
                System.out.println(total);
            } else if (operation.equals("-")) {
                double total = firstNumber - secondNumber;
                System.out.println(total);
            } else if (operation.equals("*")) {
                double total = firstNumber * secondNumber;
                System.out.println(total);
            } else if (operation.equals("/")) {
                if (secondNumber == 0) { //Added if divided by zero, it would catch the error
                    System.out.println("Error Cannot Divide by zero.");
                } else {
                    double total = firstNumber / secondNumber;
                    System.out.println(total);
                }
            } else if (operation.equals("%")) {
                double total = firstNumber % secondNumber;
                System.out.println(total);
            } else if (operation.equals("^")) {
                double total = Math.pow(firstNumber, secondNumber);
                System.out.println(total);
            } else {
                System.out.println("Error Unknown Operation");
            }

            //Ask the user if they want to continue
            System.out.println("Do you want to calculate again? (yes or no)");
            scanner.nextLine();
            String calculate = scanner.nextLine();
            if (calculate.equalsIgnoreCase("no")) {
                break;
            }
        }



    }
}