import java.util.Scanner;

/**
 * ReversePrint
 */
public class ReversePrint {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int[] arr = new int[x];

        for (int i=0; i<x; i++){
            arr[i] = scan.nextInt();
        }
        for (int i=x; i>0; i--){
            System.out.print(arr[i-1] + " ");
        }
    }
}