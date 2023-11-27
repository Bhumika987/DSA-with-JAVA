import java.util.Scanner;

public class CalculaterProgram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //take input from the user till it does not press x or X
        int ans=0;
        //infinite while loop
        while(true){
            //take the operator as input
            System.out.print("Enter the operator: ");
            char op=in.next().trim().charAt(0);
            System.out.println();

            if(op=='+'||op=='-'||op=='*'||op=='%'||op=='/'){
                //input twp numbers
                System.out.print("Enter two numbers: ");
                int num1=in.nextInt();
                int num2=in.nextInt();
                System.out.println();

                if(op=='+'){
                    ans=num1+num2;
                }
                if(op=='-'){
                    ans=num1-num2;
                }
                if(op=='*'){
                    ans=num1*num2;
                }
                if(op=='%'){
                    ans=num1%num2;
                }
                if(op=='/'){
                    if(num2!=0) {
                        ans = num1 / num2;
                    }
                }
            } else if (op=='x'||op=='X') {
                break;
            }
            else {
                System.out.println("Invalid Operation!!");
            }
            System.out.println(ans);
        }
    }
}
