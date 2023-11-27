import java.util.Scanner;

public class Largestno {
    public static void main(String[] args) {
        int n1,n2;
        Scanner input=new Scanner(System.in);
        System.out.print("num1: ");
        n1=input.nextInt();
        System.out.print("num2: ");
        n2= input.nextInt();
        System.out.println("Largest no. is: "+ (Math.max(n1,n2)));

    }
}
