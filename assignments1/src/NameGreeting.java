import java.util.Scanner;

public class NameGreeting {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name= input.next();
        System.out.println(name + " welcome to java");
        System.out.println("Welcome to JAVA " + name);
    }
}
