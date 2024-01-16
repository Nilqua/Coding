// import java.util.Arrays;
// import java.util.Scanner;

// public class nummixer {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);


//     }
// }


// import java.util.Scanner;
// public class nummixer {
//     public static void main(String[] args) {

//         Scanner scan = new Scanner(System.in);
//         int n = scan.nextInt();
//         int arrA[] = new int[n];
//         int arrB[] = new int[n];
//         int total = n*2;

//         for (int i=0; i<n; i++){
//             int numberA = scan.nextInt();
//             arrA[i] = numberA;
//         }

//         for (int i=0; i<n; i++){
//             int numberB = scan.nextInt();
//             arrB[i] = numberB;
//         }

//         int sol = scan.nextInt();

//         if (sol > 0){
//             for (int i=0; i<total; i++){
//                 System.out.print(arrA[i] + " " + arrB[i] + " ");
//                 n = n-1;
//             }
//         }
//         if (sol < 1){
//             for (int i=0; i<total; i++){
//                 System.out.print(arrB[i] + " " + arrA[i] + " ");
//                 n = n-1;
//             }
//         }
//     }
// }

import java.util.Scanner;
public class nummixer {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arrA[] = new int[n];
        int arrB[] = new int[n];

        for (int i=0; i<n; i++){
            int numberA = scan.nextInt();
            arrA[i] = numberA;
        }

        for (int i=0; i<n; i++){
            int numberB = scan.nextInt();
            arrB[i] = numberB;
        }

        int sol = scan.nextInt();

        if (sol > 0){
            int indexB = n-1;
            for (int indexA=0; indexA<n; indexA++){
                System.out.print(arrA[indexA] + " " + arrB[indexB] + " ");
                indexB--;
            }
        }
        if (sol < 1){
            int indexB = n-1;
            for (int indexA=0; indexA<n; indexA++){
                System.out.print(arrB[indexB] + " " + arrA[indexA] + " ");
                indexB--;
            }
        }
    }
}