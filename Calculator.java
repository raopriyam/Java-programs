package packages;
import java.util.Scanner;

public class Calculator {
    double val1 = 10;
    double val2 = 20;
    public void display(){
        System.out.println("Enter value:\n" +
                           "1 for Addition \n" +
                           "2 for Subtraction\n" +
                           "3 for Multiplication\n" +
                           "4 for Division");
        Scanner input = new Scanner(System.in);
        int a  = input.nextInt();
        double result;

        switch(a) {
            case 1:
                result =  val1 + val2;
                break;
            case 2:
                result =  val1 - val2;
                break;
            case 3:
                result =  val1 * val2;
                break;
            case 4:
                result =  val1 / val2;
                break;
            default:
                System.out.println("");
                return;
        }

        System.out.println(result);
    }
}
