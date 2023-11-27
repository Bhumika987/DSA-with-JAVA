import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        float p, r, t,si;
        Scanner input=new Scanner(System.in);
        System.out.print("Principal: ");
        p= input.nextFloat();
        System.out.print("Rate: ");
        r= input.nextFloat();
        System.out.print("Time: ");
        t= input.nextFloat();


        si= (p*r*t)/100;
        System.out.println("Simple Interest is: "+ si);
        
    }
}
