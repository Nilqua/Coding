import java.util.Scanner;

public class reserve_3_vans {

    static String Findlowest (int A, int B, int C)
    {
        int lowest=100000;
        String van = "A";
        if (C <= lowest)
        {
            lowest = C;
            van = "C";
        }
        if (B <= lowest)
        {
            lowest = B;
            van = "B";
        }
        if (A <= lowest)
        {
            lowest = A;
            van = "A";
        }
        return van;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int van1=0;
        int van2=0;
        int van3=0;
        
        int loop_count = scan.nextInt();
        for (int i=0; i<loop_count; i++)
        {
            int input = scan.nextInt();
            String car = Findlowest(van1, van2, van3);
            System.out.println(car);
            if (car == "A")
            {
                van1 += input;
            }
            else if (car == "B")
            {
                van2 += input;
            }
            else
            {
                van3 += input;
            }
        }
        
    }
}
