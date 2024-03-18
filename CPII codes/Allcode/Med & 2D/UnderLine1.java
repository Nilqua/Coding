import java.util.Scanner;

public class UnderLine1 {
    static void underline(String name){
        System.out.println(name);
        System.out.println("--------------------");
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        for (int i=0; i<k; i++){
            String input = new String(scan.next());
            underline(input);
        }
    }
}
