import java.util.Scanner;

public class odd_vs_even {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total_even=0;
        int total_odd=0;
        for (int i = 0; i<8; i++)
        {
            int x;
            x = scan.nextInt();
            if (x%2 == 0)
            {
                total_even += x;
            }
            else
            {
                total_odd += x;
            }
        }

        if (total_even > total_odd)
        {
            System.out.println("even");
            System.out.println(total_even);
            System.out.println(total_odd);
        }
        else if (total_even == total_odd)
        {
            System.out.println("equal");
            System.out.println(total_even);
            System.out.println(total_odd);
        }
        else
        {
            System.out.println("odd");
            System.out.println(total_even);
            System.out.println(total_odd);
        }
    }
}
