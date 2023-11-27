import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter rupees: ");
        int rupee= input.nextInt();
        float dollars = rupee / 82;
        System.out.println(dollars + " Dollars");
    }
}



