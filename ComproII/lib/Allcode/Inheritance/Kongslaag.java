//Kongslaag
import java.util.Scanner;

class Lottery {
    boolean oneFront, oneBack, twoFront, twoBack;
    int[] num = new int[4];

    Lottery(int[] arr) {
        num = arr.clone();
    }

    void reportPrize() {
        if (!oneFront && !oneBack && ! twoFront && !twoBack){
            System.out.println("Sorry, no prize");
            return;
        }
        if (oneFront) {
            System.out.println("You got one front prize");
        }
        if (oneBack) {
            System.out.println("You got one back prize");
        }
        if (twoFront) {
            System.out.println("You got two front prize");
        }
        if (twoBack) {
            System.out.println("You got two back prize");
        }
    }
}

class SlaagOffice {
    int sigle;
    int[] multi = new int[2];

    SlaagOffice(int num, int[] arr_num) {
        sigle = num;
        multi = arr_num.clone();
    }

    void checkPrize(Lottery prize) {
        if (prize.num[0] == sigle) {
            prize.oneFront = true;
        }
        if (prize.num[3] == sigle) {
            prize.oneBack = true;
        }
        if (prize.num[0] == multi[0] && prize.num[1] == multi[1]) {
            prize.twoFront = true;
        }
        if (prize.num[2] == multi[0] && prize.num[3] == multi[1]) {
            prize.twoBack = true;
        }
    }

}

public class Kongslaag {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        // Create a 2-number array from user inputs.
        int[] b = { scan.nextInt(), scan.nextInt() };
        SlaagOffice office = new SlaagOffice(a, b);

        final int Q = scan.nextInt();
        for (int i = 0; i < Q; ++i) {
            // Create a 4-number array from user inputs.
            int[] nums = { scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt() };
            Lottery lotto = new Lottery(nums);
            office.checkPrize(lotto);
            lotto.reportPrize();
        }
    }
}