//Kongslaag2
import java.util.Scanner;

class Lottery {
    boolean oneFront, oneBack, twoFront, twoBack;
    int[] num = new int[4];

    Lottery(int[] arr) {
        num = arr.clone();
    }

    void reportPrize() {
        if (!oneFront && !oneBack && !twoFront && !twoBack) {
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

class SlaagOffice2 extends SlaagOffice {
    int[][] tonton;

    SlaagOffice2(int num, int[] arr_num, int[][] arr_num_ton) {
        super(num, arr_num);
        tonton = arr_num_ton.clone();
    }

    void checkPrize(Lottery prize) {
        boolean check = false;
        for (int i = 0; i < tonton.length; i++) {
            if (prize.num[0] == tonton[i][0] && prize.num[1] == tonton[i][1] && prize.num[2] == tonton[i][2] && prize.num[3] == tonton[i][3]) {
                check = true;
            }
        }
        if (check) {
            System.out.println("You got exact-match prize");
        } else {
            System.out.println("No exact-match prize");
        }
        super.checkPrize(prize);
    }
}

public class Kongslaag2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        // Create a 2-number array from user inputs.
        int[] b = { scan.nextInt(), scan.nextInt() };
        final int R = scan.nextInt();
        int[][] exactPrizes = new int[R][];
        for (int i = 0; i < R; ++i) {
            int[] temp = { scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt() };
            exactPrizes[i] = temp;
        }
        SlaagOffice2 office = new SlaagOffice2(a, b, exactPrizes);

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