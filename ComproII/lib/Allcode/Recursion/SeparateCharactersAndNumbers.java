import java.util.Scanner;

public class SeparateCharactersAndNumbers {
    static String split(String msg) {
        if (msg.length() <= 1) {
            return msg;
        }

        char first = msg.charAt(0);

        if (Character.isDigit(first)){
            return split(msg.substring(1)) + first;
        } else {
            return first + split(msg.substring(1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String msg = sc.next();
        String res = split(msg);
        System.out.println(res);
    }
}