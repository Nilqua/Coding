import java.util.Scanner;

public class NoDividebyzero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        double num3 = scan.nextDouble();

        if (num3 == 0)
        {
            System.out.println("cannot divide bt zero");
        }
        else
        {
            // System.out.printf("%.6f", (num1+num2)/num3);
            System.out.println(String.format("%.6f", (num1+num2)/num3));
        }
    }
}
