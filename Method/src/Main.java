import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        sum();
        //calling of sum method


        //Q; input 2num and print the sum
        /*Scanner in = new Scanner(System.in);
        int n1,n2,sum;
        System.out.print("num1; ");
        n1= in.nextInt();
        System.out.print("num2; ");
        n2= in.nextInt();
        sum= n1+n2;
        System.out.println("sum of 2 nums is: "+ sum);

         */


        //do the above thing 10 times
        /*
        access modifier
        return_type name(){
        //body
        return statement;
        }
         */
    }
    static void sum(){
        Scanner in = new Scanner(System.in);
        int n1,n2,sum;
        System.out.print("num1; ");
        n1= in.nextInt();
        System.out.print("num2; ");
        n2= in.nextInt();
        sum= n1+n2;
        System.out.println("sum of 2 nums is: "+ sum);

    }
}