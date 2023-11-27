import java.util.Scanner;

public class Operators4 {
    public static void main(String[] args) {
        Scanner op=new Scanner(System.in);
        //+,-,*,/
        System.out.print("Num1: ");
        int num1=op.nextInt();
        System.out.print("Num2: ");
        int num2=op.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum is: "+ sum);
        if(true){
            int sub= num1-num2;
            System.out.println("Sub is: "+ sub);
        }
        if(true){
            int mul= num1*num2;
            System.out.println("Product is: "+ mul);
        }
        if(true){
            int div=num1/num2;
            System.out.println("Remainder is: "+ div);
        }
    }
}
