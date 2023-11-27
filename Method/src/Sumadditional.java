import java.util.Scanner;

public class Sumadditional {
    public static void main(String[] args) {
        int ans = sum2();
        System.out.println(ans);
    }
    //pass the value of numbers when you are calling the methog
    //in the main()
    static int sum2(){
        Scanner in = new Scanner(System.in);
        int n1,n2,sum;
        System.out.print("num1; ");
        n1= in.nextInt();
        System.out.print("num2; ");
        n2= in.nextInt();
        sum= n1+n2;
        return sum;//function over
    }
}
