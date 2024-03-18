import java.util.Scanner;

public class BaseConverter {
    String convertBase(int decimal, int base){
        if (decimal/base == 0){
            return String.valueOf(decimal%base);
        } else {
            return convertBase(decimal/base, base) + decimal%base;
        } 
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BaseConverter bc = new BaseConverter();
        int decimal = scan.nextInt();
        int base = scan.nextInt();
        System.out.println(bc.convertBase(decimal, base));
    }
}
