import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    private String userInput;

    public void messagePrompt() {

        Scanner stdIn = new Scanner(System.in);
        System.out.println("Welcome to my simple calculator simulator!");
        System.out.println("What sort of operation would you like to do?");
        System.out.println("List of operations: ");
        System.out.println("""
                1. +
                2. -
                3. x
                4. /""");
        System.out.print("Enter the symbol of your desired operation: ");
        userInput = stdIn.nextLine();
        while (isInput(userInput)) {
            if (userInput.equals("+")) {
                double x, y;
                try {
                    System.out.print("X: ");
                    x = stdIn.nextDouble();
                    System.out.print("Y: ");
                    y = stdIn.nextDouble();
                    System.out.println(x + " + " + y + " = " + Math.round(addition(x, y) * 100.00) / 100.00);
                } catch (InputMismatchException exception) {
                    System.out.println("Invalid Input");
                }
            }
        }
    }

    private double addition(double x, double y) {
        return x + y;
    }

    private boolean isInput(String userInput) {
        return userInput != null;
    }
}
