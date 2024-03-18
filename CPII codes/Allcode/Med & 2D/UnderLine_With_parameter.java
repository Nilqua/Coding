import java.util.Scanner;

public class UnderLine_With_parameter {
    static void underline(String name,int loop){
        System.out.println(name);
        for(int i=0; i<loop; i++){
            System.out.print("-");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        for (int i=0; i<k; i++){
            String input = new String(scan.next());
            int count = scan.nextInt();
            underline(input,count);
        }
    }
}
