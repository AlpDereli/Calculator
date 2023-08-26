import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        int i1, i2;
        Scanner take = new Scanner(System.in);
        System.out.println("Please enter the first integer: ");
        i1 = take.nextInt();
        System.out.println("Please enter the second integer: ");
        i2 = take.nextInt();
        System.out.println("Please select the operation: ");
        System.out.println("Addition (1)");
        System.out.println("Difference (2)");
        System.out.println("Product (3)");
        System.out.println("Division (4)");
        int i = take.nextInt();

        switch (i)
        {
            case 1:
            {
                System.out.println("Sum: " + (i1+ i2));
                break;
            }
            case 2:
            {
                System.out.println("Difference: " +(i1-i2));
                break;
            }
            case 3:
            {
                System.out.println("Product: " + (i1*i2));
                break;
            }
            case 4:
            {
                float f = i1/i2;
                System.out.println("Div: " + f);
                break;
            }
            default:
            {
                System.out.println("İnvalid operation");
            }
        }
    }
}
