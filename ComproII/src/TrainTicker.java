import java.util.Arrays;
import java.util.Scanner;

public class TrainTicker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] N = new int[scan.nextInt()];
        int P = scan.nextInt();
        int K = scan.nextInt();
        int[] current_passenger = new int[N.length];

        for (int i=0; i<K; i++){
            int X = scan.nextInt();
            int Y = scan.nextInt();
            int Z = scan.nextInt();

            if (((current_passenger[X-1]+Z) <= P) && ((current_passenger[Y-1]+Z) <= P)){
                for (int j=X; j<=Y; j++){
                    current_passenger[j-1] += Z;
                }
                System.out.println("Y " + Arrays.toString(current_passenger));
            }
            else{
                System.out.println("N " + Arrays.toString(current_passenger));
            }
        }
    }
}
