import java.util.Scanner;

public class SMSEncode {

    static void suEncode(String sentence, char ichar) {
        // System.out.println(sentence + " " + ichar);
        int L = sentence.length();
        if (L <= 1) {
            return;
        }

        char first = sentence.charAt(0);
        char last = sentence.charAt(L - 1);

        int code1 = first - ichar;
        int code2 = last - first;

        System.out.println(code1 + " " + code2);
        String sentence2 = sentence.substring(1, L - 1);
        suEncode(sentence2, first);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.next();
        char ichar = 'A' - 1;
        suEncode(sentence, ichar);
    }
}