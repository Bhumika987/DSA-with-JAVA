import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner year = new Scanner(System.in);
        int y = year.nextInt();
        if (y % 4 == 0 || y % 400 == 0) {
            System.out.println(y + " is a leap  year");
        } else {
            System.out.println(y + " is not a leap year");
        }
    }
}