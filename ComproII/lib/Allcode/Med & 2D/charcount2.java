import java.util.*;
public class charcount2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] Char = new int[101];
        int K = scan.nextInt();
        int Count = 0;
        int realcount = 0 ;
        char realchar = ' ';
        String text = "";
        while (true) {
            text = scan.nextLine();
            for (int i=0; i<text.length(); i++){
                Char[text.charAt(i)] ++;
                if (Char[text.charAt(i)] == K){
                    realcount = Count;
                    realchar = text.charAt(i);
                    break;
                }
            }
            Count++;
        }
        
        System.out.println(realchar);
        System.out.println(realcount);
    }
}