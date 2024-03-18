package Class.Hard_Level;
import java.util.Scanner;

class MakeBurger {
    private String meat;
    private boolean lettuce, tomato, pickled;
    private int numCheese;
    private double price;

    MakeBurger(String meat, boolean lettuce, boolean tomato, boolean pickled, int num){
    this.meat = meat+"BURGER";
    this.lettuce = lettuce;
    this.tomato= tomato;
    this.pickled = pickled;
    if (num<0){ this.numCheese = 0;}
    else if (num>=3) {this.numCheese = 3;}
    else {this.numCheese = num;}
    this.price = 49+(20*numCheese);
    }

    void printInfo() {
        System.out.print(meat);
        if (lettuce)
            System.out.print(" lettuce");
        if (tomato)
            System.out.print(" tomato");
        if (pickled)
            System.out.print(" pickled");
        System.out.print(" cheese" + numCheese);
        System.out.print(" = $" + price);
    }
}

public class Burger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String meatorder = scan.next();
        String veg = scan.next();
        int n = scan.nextInt();
        boolean flag_lettuce = (veg.charAt(0) == 'Y' ? true : false);
        boolean flag_tomato = (veg.charAt(1) == 'Y' ? true : false);
        boolean flag_pickled = (veg.charAt(2) == 'Y' ? true : false);
        MakeBurger b = new MakeBurger(meatorder, flag_lettuce, flag_tomato, flag_pickled, n);
        b.printInfo();
    }
}