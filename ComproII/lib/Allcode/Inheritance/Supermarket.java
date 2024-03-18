import java.util.ArrayList;
import java.util.Scanner;

// เนื่องจากจำไม่ได้ว่า ราคา กับ น้ำหนัก แต่ละอันเท่าไหร่ จึงขอ assume ว่าเป็น 1 ไปละกัน (Line 81-82)

class FacFruit{
    ArrayList<Basket> bs = new ArrayList<>();
    int P, W;
    int income = 0;

    FacFruit(int P_in, int W_in){
        P = P_in;
        W = W_in;
    }

    void printAll(){
        boolean trig = false;
        for (int i=0; i<bs.size(); i++){
            print(i+1);
            trig = true;
        }
        if (!trig){
            System.out.println("nothing to sell");
        }
    }

    void print(int n){
        n--;
        if (n < 0 || n > bs.size()-1){
            System.out.println("invalid");
        } else {
            String line = String.format("%d %d %d %d %d %d, %d %d %d",bs.get(n).grape, bs.get(n).melon, bs.get(n).apple, bs.get(n).cherry, bs.get(n).pear, bs.get(n).kiwi, bs.get(n).totalPrice, bs.get(n).weight, bs.get(n).type);
            System.out.println(line);
        }
    }

    void sellBasket(int n){
        n--;
        if (n < 0 || n > bs.size()-1){
            System.out.println("invalid");
        } else {
            String line = String.format("sell Basket: %d %d", n+1, bs.get(n).totalPrice);
            System.out.println(line);
            income += bs.get(n).totalPrice;
            bs.remove(n);
        }
    }

    void addBasket(Basket b){
        if (check(b)){
            bs.add(b);
        }
    }

    boolean check(Basket b){
        boolean valid = true;
        if (b.totalPrice < 0 || b.totalPrice > P){
            valid = false;
        }
        if (b.weight < 0 || b.weight > W){
            valid = false;
        }
        if (b.type < 3){
            valid = false;
        }
        return valid;
    }
}

class Basket{
    int grape, melon, apple, cherry, pear, kiwi;
    int totalPrice, weight, type;
    
    Basket(int g, int m, int a, int c, int p, int k){
        grape = g;
        melon = m;
        apple = a;
        cherry = c;
        pear = p;
        kiwi = k;
        totalPrice = grape+melon+apple+cherry+pear+kiwi;
        weight = totalPrice;
        type = PositiveToNeg(grape)+PositiveToNeg(melon)+PositiveToNeg(apple)+PositiveToNeg(cherry)+PositiveToNeg(pear)+PositiveToNeg(kiwi);
    }

    static int PositiveToNeg(int in){
        return in > 0 ? 1 : 0;
    }
}

public class Supermarket{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int P_in = scan.nextInt();
        int W_in = scan.nextInt();
        FacFruit market = new FacFruit(P_in, W_in);
        while(true){
            int grape = scan.nextInt();
            int melon = scan.nextInt();
            int apple = scan.nextInt();
            int cherry = scan.nextInt();
            int pear = scan.nextInt();
            int kiwi = scan.nextInt();
            Basket t = new Basket(grape, melon, apple, cherry, pear, kiwi);
            if (t.type == 0){
                break;
            } else {
                market.addBasket(t);
            }
        }
        
        while (true) {
            String commad = scan.next();
            if (commad.equals("stop")){
                System.out.println("income: " + market.income);
                break;
            } else if (commad.equals("print")){
                int n = scan.nextInt();
                market.print(n);
            } else if (commad.equals("printAll")){
                market.printAll();
            } else if (commad.equals("sell")){
                int n = scan.nextInt();
                market.sellBasket(n);
            }
        }
    }
}