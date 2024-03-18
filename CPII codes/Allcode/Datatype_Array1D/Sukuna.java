import java.util.Scanner;
public class Sukuna {
    public static void main(String[] arsg){

        Scanner scan = new Scanner(System.in);
        int box = scan.nextInt();
        int arr[] = new int[box+1];
        int count[] = new int[box+1];
        int no = 0;

        for (int i=1; i<=box; i++){
            int num = scan.nextInt();
            arr[i] = num;
        }
        for (;;){

            int jujutsu = scan.nextInt();

            if (jujutsu == 0){
                break;
            }
            if (jujutsu <= 99 || jujutsu >= 1000){
                System.out.println("JUBUTSU !");
                no +=1;
            }
            else {
                int b = scan.nextInt();
                arr[b] = arr[b] - 1;
                if (arr[b] >= 0){
                    System.out.println("OK !");
                    count[b] +=1;
                }
                else if (arr[b] < 0){
                    System.out.println("SUKUNA !");
                }

            }
        }
        for (int i=1; i<=box; i++){
            System.out.print(i + " ");
            System.out.println(count[i]);
        }
        System.out.println(no);
    }
}