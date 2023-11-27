import java.util.Scanner;

public class tempconv {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temprature in celcius: ");
        float temp_c= input.nextFloat();
        float temp_f= (temp_c*9/5)+32;
        double temp_k= (temp_c+275.15);
        System.out.println("Fahrenheit temp: "+ temp_f);
        System.out.println("Kelvin temp: "+ temp_k);

    }
}
