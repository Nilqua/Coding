import java.util.Scanner;

class FieldManager{
    private boolean[] not_empty;
    FieldManager(int num){
        this.not_empty = new boolean[num];
    }
    
    int reserveBed(){
        int index = 0;
        for (boolean i: not_empty){
            if (i == false){
                not_empty[index] = true;
                return index+1;
            }
            index++;
        }
        return -1;
    }
    
    boolean discharge(int num){
        num--;
        if (not_empty[num] == false){
            System.out.println("Invalid bed number");
            return false;
        } else {
            System.out.println("Patient discharged");
            not_empty[num] = false;
            return true;
        }
    }

    int reportBed(){
        int bed = 0;
        for (boolean i: not_empty){
            if (i == true){
                bed++;
            }
        }
        return bed;
    }
}
public class FieldHospital {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num_bed = scan.nextInt();
        int n = scan.nextInt();
        FieldManager hos = new FieldManager(num_bed);
        for (int i=0; i<n; i++){
            int k = scan.nextInt();
            int a = scan.nextInt();
            switch (k) {
                case 1:
                    int tmp = hos.reserveBed();
                    if (tmp != -1){
                        System.out.println("Bed " + tmp + " reserved");
                    } else {
                        System.out.println("No bed vacancy");
                    }
                    break;
                case 2:
                    hos.discharge(a);
                    break;
                case 3:
                    System.out.println(hos.reportBed());
                    break;
            }
        }
        scan.close();
    }
}
