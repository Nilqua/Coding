import java.util.Scanner;

public class Base2 {
    static int power(int a, int b){
        if (b==0){
            return 1;
        } else {
            return a * power(a, b-1);
        }
    }

    static int ortherToDecimal(String value, int base){
        int length = value.length();
        if (length <= 0){
            return 0;
        } else {
            String first = String.valueOf(value.charAt(0));
            String new_Value = value.substring(1);
            return ortherToDecimal(new_Value, base) + (Integer.valueOf(first) * power(base, length-1));
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int decimal = scan.nextInt();
        int base = scan.nextInt();
        String value = scan.next();
        System.out.println(ortherToDecimal(value, base));

    }
}