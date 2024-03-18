import java.util.Scanner;

public class CharWatch1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String temp = new String(scan.nextLine());
        String text = new String(scan.nextLine());

        char A = temp.charAt(0);
        char B = temp.charAt(2);
        char C = temp.charAt(4);

        int loop_count = scan.nextInt();
        int error = 0, count_A = 0, count_B = 0, count_C = 0; 
        for (int i=0; i<loop_count; i++){
            int index = scan.nextInt()-1;
            if (index < 0 || index >= text.length()){
                error++;
            }
            else if (A == text.charAt(index)){
                count_A++;
            }
            else if (B == text.charAt(index)){
                count_B++;
            }
            else if (C == text.charAt(index)){
                count_C++;
            }
        }
        System.out.println(count_A);
        System.out.println(count_B);
        System.out.println(count_C);
        System.out.println(error);
    }
}
