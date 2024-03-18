import java.util.Scanner;;

public class crypto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N; ++i) {
            A[i] = scan.nextInt();
        }
        int pos = scan.nextInt();
        int key = scan.nextInt();
        boolean b1 = (A[pos] + key <= 51743);
        boolean b2 = (A[pos+1] - key > 7832);
        boolean b3 = (A[pos+2] - key < 2394);
        boolean b4 = (A[pos+3] + key > 9213);
        if(b1 || b2) 
            System.out.println("pass");
        else 
            System.out.println("fail");
        if(b3 || b4)
            System.out.println("pass");
        else 
            System.out.println("fail");
        
        if((b1 || b2) && (b3 || b4))
            System.out.println("pass");
        else 
            System.out.println("fail");
    }
}