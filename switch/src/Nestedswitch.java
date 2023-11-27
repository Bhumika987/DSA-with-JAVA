import java.util.Scanner;

public class Nestedswitch {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();

        switch (empID) {
            case 1 -> System.out.println("Bhumika Sahu");
            case 2 -> System.out.println("Ashish ");
            case 3 -> {
                System.out.println("emp/id 3");
                switch (department) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                    default:
                        System.out.println("No department alloted");
                }
            }
            default -> System.out.println("wrong empID");
        }
    }
}
