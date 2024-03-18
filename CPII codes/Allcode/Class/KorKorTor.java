import java.util.Scanner;

class Party {
    String[] regis_name;
    String[] regis_surname;
    int[] regis_regionNumber;

    String partyName;
    int partyNum;

    Party(String partyName, int num, Scanner scan){
        this.regis_name = new String[num];
        this.regis_surname = new String[num];
        this.regis_regionNumber = new int[num];
        
        this.partyName = partyName;

        for(int i=0; i<num; i++){
            this.regis_name[i] = scan.next();
            this.regis_surname[i] = scan.next();
            this.regis_regionNumber[i] = scan.nextInt();
        }
    }

    void printInfo(int regionNumber){
        if (regionNumber == 0){
            for(int i=0; i<regis_regionNumber.length; i++){
                System.out.println(regis_name[i] + " " + regis_surname[i] + " " + regis_regionNumber[i]);
            }
            return;
        } else if (regionNumber < 0) {
            System.out.println("invalid region number");
            return;
        } else {
            boolean trigger = false;
            for (int i=0; i<regis_regionNumber.length; i++){
                if (regionNumber == this.regis_regionNumber[i]){
                    System.out.println(regis_name[i] + " " + regis_surname[i]);
                    trigger = true;
                }
            }
            if (!trigger){
                System.out.println("none");
            }
        }
    }
}

public class KorKorTor{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int temp = scan.nextInt();
        Party[] party = new Party[temp];

        String[] partyNameTemp = new String[temp];
        int[] partyNumberTemp = new int[temp];
        for(int i=0; i<temp; i++){
            partyNameTemp[i] = new String(scan.next());
            partyNumberTemp[i] = scan.nextInt();
        }

        for (int i=0; i<temp; i++){
            party[i] = new Party(partyNameTemp[i], partyNumberTemp[i], scan);
        }

        final int K = scan.nextInt();
        for(int i = 0; i < K; ++i) {
        int partyNumber = scan.nextInt()-1;
        int regionNumber = scan.nextInt();
        party[partyNumber].printInfo(regionNumber);
        }
       }
}