import java.util.Scanner;

public class PressX{
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int sum = 0;
            String inputNumber = "";

            while (!inputNumber.equals("x")) {
                System.out.print("Enter a number (or 'x' to exit): ");
                inputNumber = input.nextLine();

                if (!inputNumber.equals("x")) {
                    int number = Integer.parseInt(inputNumber);
                    sum += number;
                }
            }

            System.out.println("Sum of all numbers: " + sum);
        }
    }


