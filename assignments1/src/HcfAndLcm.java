import java.util.Scanner;


public class HcfAndLcm {
    public static void main(String[] args) {
        int temp1, temp2, num1, num2, temp, hcf, lcm;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter First Number: ");
        num1 = input.nextInt();
        System.out.print("Enter Second Number: ");
        num2 = input.nextInt();

        temp1 = num1;
        temp2 = num2;

        while(temp2 != 0){
            temp = temp2;
            temp2 = temp1%temp2;
            temp1 = temp;
        }

        hcf = temp1;
        lcm = (num1*num2)/hcf;

        System.out.println("HCF of input numbers: "+hcf);
        System.out.println("LCM of input numbers: "+lcm);
    }
}





