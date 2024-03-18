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

public class Alicars {
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
                System.out.println("valid");
            } else {
                System.out.println("invalid");
            }
        }
        for (int i = 0; i < cars.size(); ++i) {
            System.out.println(cars.get(i).code + " " + cars.get(i).name);
        }  
    }
}