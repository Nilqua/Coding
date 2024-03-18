import java.util.Scanner;

public class how_to_break {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count=0;
        while (true)
        {
            int input = scan.nextInt();
            if (input == 0)
            {
                break;
            }
            else
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
