import java.util.ArrayList;
import java.util.Scanner;

class Car {
    int code;
    String name;
    int price;
    int labor;

    Car(int code, String name, int price, int labor) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.labor = labor;
    }

    static boolean check(int code, String name, int price, int labor) {
        if ((name.equals("") || name.equals("null")) || (price < 1) || (labor < 1)) {
            return false;
        } else {
            return true;
        }
    }
}

class Factory{
    int number;
    boolean[] code_can;
    int labor;
    Factory(int labor, boolean[] code_can){
        this.labor = labor;
        this.code_can = code_can;
    }
}
public class Alicars2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        ArrayList<Car> cars = new ArrayList<>();

        int code = 1;
        for (int i = 0; i < N; ++i) {
            String name = scan.next();
            int price = scan.nextInt();
            int labor = scan.nextInt();
            if (Car.check(i, name, price, labor)) {
                Car temp = new Car(code, name, price, labor);
                cars.add(temp);
                code++;
            }
        }
        Factory factory[] = new Factory[5];
        for(int i=0; i<5; i++){
            int labor_in = scan.nextInt();
            boolean[] code_in = new boolean[N];
            for (int j=0; j<N ; j++){
                if (scan.nextInt() == 1){
                    code_in[j] = true;
                } else {
                    code_in[j] = false;
                }
            }
            factory[i] = new Factory(labor_in, code_in);
        }
        int k = scan.nextInt();
        for (int i=0; i<k; i++){
            int input = scan.nextInt();
            if (input > cars.size() || input < 1){
                System.out.println("invalid model");
            } else {
                System.out.println("okay " + (factory[i-1].number));
                factory[i].labor -= cars.get(i).labor;
            }
        }
    }
}