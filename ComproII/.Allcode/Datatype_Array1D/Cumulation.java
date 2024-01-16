import java.util.Scanner;

public class Cumulation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] N = new int[scan.nextInt()-1];
        int Loopcount = scan.nextInt();

        for (int i=0; i<Loopcount; i++){
            int X = scan.nextInt();
            int Y = scan.nextInt();
            int Z = scan.nextInt();

                for (int j=X; j<=Y; j++){
                    N[j-1] += Z;
                }
                for (int j=0; j<N.length; j++){
                    System.out.print(N[j] + " ");
                }
                System.out.println();
            }
        }
    }
