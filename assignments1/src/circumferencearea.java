import java.util.Scanner;

public class circumferencearea {
    public static void main(String[] args) {
        circle();
        }

        public static void circle() {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the Radius: ");
            int r = in.nextInt();
            System.out.println("Circumference is "+(2*3.14*r));
            System.out.println("Area is "+(2*3.14*r));



    }
}
