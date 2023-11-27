import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
       /* int n = input.nextInt(); // Specify the value of n for which you want to find the Fibonacci number
        int result = f(n);
        System.out.println("The " + n + "th Fibonacci number is: " + result);
    }

    public static int f(int n) {
        if (n <= 1)
            return n;

        int fib = 1;
        int prevFib = 1;

        for (int i = 2; i < n; i++) {
            int temp = fib;
            fib += prevFib;
            prevFib = temp;
        }

        return fib;

        */
        int n = input.nextInt();
        int a = 0;
        int b = 1;
        int count =2;

        while (count <=n){
            int temp = b;
            b=b+a;
            a=temp;
            count++;
        }
        System.out.println(b);
    }
}
