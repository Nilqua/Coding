//Exception
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {
    static int Print(int x){
        return 1;
    }
    static int Print(String x){
        return 2;
    }


    public static void main(String[] args) {

        System.out.println(Print(1));
        System.out.println(Print("asdasfjkdf"));
        ArrayList<Integer> a = new ArrayList<>();
        a.remove((Object)1);
        a.remove(0);
        // Scanner scan = new Scanner(System.in);
        // int n = scan.nextInt();
        // int[] arr = { 1, 2, 3, 4, 5 };

        // System.out.println(arr[10]);
        // try {
        //     System.out.println(arr[0]);
        //     System.out.println(arr[1]);
        //     System.out.println(arr[10]);
        //     System.out.println(arr[2]);
        //     System.out.println(arr[3]);
        //     System.out.println(arr[4]);
        // } catch (InputMismatchException ex) {
        //     System.out.println("Error!");
        //     System.out.println(ex);
        // } catch (ArrayIndexOutOfBoundsException ex) {
        //     System.out.println(ex);
        // } finally {
        //     System.out.println("Good bye!");
        // }
        // String name = scan.nextLine();
        
        // System.out.println("GB2");
    }
}
