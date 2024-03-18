import java.util.Scanner;

public class OperSelect {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

    int x,y,selecter;
    x = scan.nextInt();
    y = scan.nextInt();
    selecter = scan.nextInt();

    switch (selecter)
    {
        case 1:
        System.out.println(x+y);
        break;
        case 2:
        System.out.println(x-y);
        break;
        case 3:
        System.out.println(x*y);
        break;
        case 4:
        if (y == 0)
        {
            System.out.println("cannot divide by zero");
        }
        else
        {
            System.out.println(x/y);
        }
        break;
        case 5:
        if (y == 0)
        {
            System.out.println("cannot divide by zero");
        }
        else
        {
            System.out.println(x%y);
        }
        break;
        default :
        System.out.println("Enter operation 1-5");
    }
}
}
