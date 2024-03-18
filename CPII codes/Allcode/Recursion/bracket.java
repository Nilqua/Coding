import java.util.Scanner;

public class bracket {
    public static boolean CheckBracket(String input){
        if (((input.indexOf("{") == -1) ? true : false) && ((input.lastIndexOf("}")) == -1 ? true : false)){
            return true;
        } else {
            if (((input.indexOf("{") != -1) ? true : false) && ((input.lastIndexOf("}")) != -1 ? true : false)){
                return true;
            } else {
                return false;
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(CheckBracket(str));
    }
}
