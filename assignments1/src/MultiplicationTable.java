import java.util.Scanner;

public class MultiplicationTable {
            public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            System.out.println("Enter a num: ");
            int num= input.nextInt();
            for (int i=0; i<= 10; i++){
                //System.out.println(num + " x " + (i+1) + " = " + (num * (i+1)));
                System.out.println(num +"*" + i + "=" + (num*i));

            }

        }

}
