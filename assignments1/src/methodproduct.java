import java.util.Scanner;

public class methodproduct {
    public static void main(String[] args) {

        Product();
    }
    public static void Product() {
        Scanner in = new Scanner(System.in) ;
        int x,y;
        System.out.print("Enter 1 no. :");
        x = in.nextInt();
        System.out.print("Enter 2 no. :");
        y = in.nextInt();
        System.out.println("Product = " + (x*y));
    }

}
