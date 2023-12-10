import java.util.Scanner;

public class vote {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] n = new int[scan.nextInt()];
        int k = scan.nextInt();
        
        for (int i=0; i<k; i++){
            int input = scan.nextInt();
            n[input-1]++;
        }
        
        int hightest=-1;
        int candidate=0;
        for (int i=0; i<n.length; i++){
            if (n[i]>hightest){
                hightest = n[i];
                candidate = i+1;
            }
        }
        System.out.println(candidate);
        System.out.println(n[candidate-1]);

    }
}
