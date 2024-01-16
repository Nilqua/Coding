import java.util.Scanner;

public class CharWatch2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String temp = new String(scan.nextLine());

        char A = temp.charAt(0);
        char B = temp.charAt(2);
        char C = temp.charAt(4);

        int strarr = scan.nextInt();
        String[] string_arr = new String[strarr];

        for (int i=0; i<strarr; i++){
            string_arr[i] = scan.nextLine();
        }
        int loop_count = scan.nextInt();
        int count_A = 0, count_B = 0, count_C = 0; 

        for (int i=0; i<loop_count; i++){
            int index = scan.nextInt()-1;
            for (int j=0; j<strarr; j++){
                if (index < 0 || index >= string_arr[j].length()){
                    continue;
                }
                else if (A == string_arr[j].charAt(index)){
                    count_A++;
                }
                else if (B == string_arr[j].charAt(index)){
                    count_B++;
                }
                else if (C == string_arr[j].charAt(index)){
                    count_C++;
                }
            }
        }
        System.out.println(count_A);
        System.out.println(count_B);
        System.out.println(count_C);
    }
}
