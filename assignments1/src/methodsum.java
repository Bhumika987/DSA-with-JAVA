import java.util.Scanner;

public class methodsum {
    public static void Sum() {
        Scanner in = new Scanner(System.in) ;
        int x,y;
        System.out.print("Enter 1 no. :");
        x = in.nextInt();
        System.out.print("Enter 2 no. :");
        y = in.nextInt();
        System.out.println("Sum = " + (x+y));
    }

    public static void main(String[] args) {
        Sum();
    }

}
