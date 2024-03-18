import java.util.Scanner;
public class NumberOccur {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int[] arr = new int[x];

        for (int i=0; i<arr.length; i++){
             arr[i] = scan.nextInt();
        }
        
        int n = scan.nextInt();
        boolean found = false;
        for (int i=0; i<arr.length; i++){
            if (arr[i] == n){
                System.out.print(i+1 + " ");
                found = true;
            }

        }
        if (!found){
            System.out.println(0);
        }
    }
}
