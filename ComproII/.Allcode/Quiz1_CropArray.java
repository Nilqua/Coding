// import java.util.Scanner;
// public class uiz1_CropArray {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         int[] arr = new int[scan.nextInt()];
        
//         for (int i=0; i<arr.length; i++){
//             arr[i] = scan.nextInt();
//         }

//         int loop_count = scan.nextInt();
//         for (int i=0; i<loop_count; i++){
//             int a = scan.nextInt();
//             int b = scan.nextInt();

//             if (a <= b){
//                 if ((a<=0 && b<=0) || (a>arr.length && b>arr.length)){
//                     System.out.println("Invalid");
//                     continue;
//                 }
//                 if (a <= 0){
//                     a = 1;
//                 }
//                 if (b > arr.length){
//                     b = arr.length;
//                 }
//                 for (int j=a-1; j<b; j++){
//                     System.out.print(arr[j] + " ");
//                 }
//                 System.out.println();
//             }

//             else if(a > b){
//                 int temp = a;
//                 a = b;
//                 b = temp;
//                 if ((a<=0 && b<=0) || (a>arr.length && b>arr.length)){
//                     System.out.println("Invalid");
//                     continue;
//                 }
//                 if (a <= 0){
//                     a = 1;
//                 }
//                 if (b > arr.length){
//                     b = arr.length;
//                 }
//                 for (int j=a-1; j<b; j++){
//                     System.out.print(arr[j] + " ");
//                 }
//                 System.out.println();
//             }
//         }
//     }    
// }

//-----------------------------------------------------------------------------------
//with medthod
import java.util.Scanner;

public class Quiz1_CropArray {
        static void Pleaseleavemealone(int a, int b,int[] arr) {
            if ((a<=0 && b<=0) || (a>arr.length && b>arr.length)){
                    System.out.print("Invalid");
                }
                if (a <= 0){
                    a = 1;
                }
                if (b > arr.length){
                    b = arr.length;
                }
                for (int j=a-1; j<b; j++){
                    System.out.print(arr[j] + " ");
                }
                System.out.println();
        }   
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[scan.nextInt()];
        
        for (int i=0; i<arr.length; i++){
            arr[i] = scan.nextInt();
        }

        int loop_count = scan.nextInt();
        for (int i=0; i<loop_count; i++){
            int a = scan.nextInt();
            int b = scan.nextInt();

            if (a <= b){
                Pleaseleavemealone(a,b,arr);
            }
            else if(a > b){
                Pleaseleavemealone(b,a,arr);
            }
        }
    }    
}