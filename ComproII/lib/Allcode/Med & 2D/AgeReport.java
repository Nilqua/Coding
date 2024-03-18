import java.util.ArrayList;
import java.util.Scanner;

public class AgeReport {
    static ArrayList<Integer> reportAge(int[] id, int[] age, int min, int max){
        ArrayList<Integer> report_ID = new ArrayList<>();
        for (int i=0; i<id.length; i++){
            if (age[i] >= min && age[i] <= max){
                report_ID.add(id[i]);
            }
        }
        return report_ID;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] ID = new int[n];
        int[] AGE = new int[n];
        for (int i=0; i<n; i++){
            ID[i] = scan.nextInt();
            AGE[i] = scan.nextInt();
        }
        int x = 0, y = 0;
        x = scan.nextInt();
        y = scan.nextInt();
        ArrayList<Integer> report = new ArrayList<>(reportAge(ID, AGE, x, y));
        for (int i:report){
            System.out.println(i);
        }
        System.out.println("There are "+ report.size()+" persons in age range of "+ x +" to "+ y);
    }
}
