import java.util.Scanner;

public class factmethod {
    public static void main(String[] args) {
        //System.out.println(fact(5));
        //System.out.println(fact(4));
        //System.out.println(fact(3));
        //System.out.println(fact(2));
        //System.out.println(fact(1));
        //System.out.println(fact(0));
        Scanner in = new Scanner(System.in) ;
        int x = in.nextInt() ;
        System.out.println(fact(x));
    }

    public static int fact(int x){
        if(x == 0 || x == 1){
            return 1;
        }
        else {
            return fact(x-1)*x;
        }
    }
}
