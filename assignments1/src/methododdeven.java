import java.util.Scanner;

public class methododdeven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;
        int num = in.nextInt() ;
        System.out.println(even(num));
    }

    static int even(int num) {
        if (num % 2 == 0) {
            System.out.println("Num is even");
        } else {
            System.out.println("Num is odd");
        }
        return(num);
    }
}
