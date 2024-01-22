package Class;
import java.util.Scanner;

class CookiePlanner {
    private int flours_need,butters_need;
    private int flour = 0,butter = 0;
    private int bags = 0;

    CookiePlanner (int Flours_need, int Butters_need){
        this.flours_need = Flours_need;
        this.butters_need = Butters_need;
    }
    
    int calculate(){
        int f_can = flour/flours_need;
        int b_can = butter/butters_need;
        return Math.min(f_can, b_can);
    }

    boolean produce(int cookie_want){
        int f_use = flours_need * cookie_want;
        int b_use = butters_need * cookie_want;
        if (f_use <= flour && b_use <= butter){
            this.bags += cookie_want;
            flour -= f_use;
            butter -= b_use;
            System.out.print(bags);
            return true;
        } else {
            System.out.print("Max capacity = "+ calculate() +" bags, but "+ cookie_want +" bags requested");
            return false;
        }
    }

    boolean addFlour(int num){
        if (num <= 0){
            System.out.print("Invalid flour quantity");
            return false;
        } else {
            this.flour += num;
            System.out.print(flour);
            return true;
        }
    }
    boolean addButter(int num){
        if (num <= 0){
            System.out.print("Invalid butter quantity");
            return false;
        } else {
            this.butter += num;
            System.out.print(butter);
            return true;
        }
    }
    void reportProduction(){
        System.out.println("Cookie bags: "+ bags);
        System.out.println("Flour left: "+ flour);
        System.out.println("Butter left: "+ butter);
    }
}

public class Homemade_cookie {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int f = scan.nextInt();
        int b = scan.nextInt();
        CookiePlanner human = new CookiePlanner(f, b);

        int n = scan.nextInt();
        for (int i=0; i<n; i++){
            int k = scan.nextInt();
            int a = scan.nextInt();
            switch (k) {
                case 1:
                    System.out.print(" " +human.addFlour(a));
                    System.out.println();
                    break;
                case 2:
                    System.out.print(" " +human.addButter(a));
                    System.out.println();
                    break;
                case 3:
                    System.out.print(" " +human.produce(a));
                    System.out.println();
                    break;
            }
        }
        human.reportProduction();
    }
}