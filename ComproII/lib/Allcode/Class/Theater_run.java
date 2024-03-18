package Class;
import java.util.Scanner;

class Theater {
    boolean threeD, luxury;
    int numSeats;
    String title = "price is not set";
    int basePrice;
    boolean[] seats;

    Theater(boolean is_3D, boolean is_premium, int seat) {
        seats = new boolean[seat];
        this.threeD = is_3D;
        this.luxury = is_premium;
    }

    void imsosorry(){
        System.out.println("sorry");
    }
    void setTitle(String title) {
        this.title = title;
    }

    void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }

    int reserveOne(int seatNumber) {
        if (seatNumber < 1 || seatNumber > seats.length || seats[seatNumber-1] == true) {
            imsosorry();
            return -1;
        } else {
            seats[seatNumber-1] = true;
            return basePrice;
        }
    }

    int reserveMultiple(int number, int start_seat) {
        // System.out.println("input number : " + number);
        // System.out.println("input start_seat : " + start_seat);
        if (start_seat < 1 || start_seat > seats.length) {
            imsosorry();
            return -1;
        }
        for (int i = start_seat; i<=number+start_seat-1; i++){
            if (i > seats.length || seats[i-1] == true){
                imsosorry();
                return -1;
            }
        }
        for (int i = start_seat; i<=number+start_seat-1; i++){
            seats[i-1] = true;
        }
        return (number * basePrice);
    }

    void printInfo() {
        if (threeD) {
            System.out.println("3D");
        } else {
            System.out.println("No 3D");
        }
        if (luxury) {
            System.out.println("Luxury");
        } else {
            System.out.println("Standard");
        }
        System.out.println(seats.length);
        System.out.println(title);
        if (basePrice < 1) {
            System.out.println("price is not set");
        } else {
            System.out.println(basePrice);
        }
    }

    // void printseats() {
    //     System.out.println(Arrays.toString(seats));
    // }
}

// Do not modify the code below. You must leave it as is.
public class Theater_run {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int threeD1 = scan.nextInt();
        int luxury1 = scan.nextInt();
        int numSeats = scan.nextInt();
        boolean threeD = false;
        boolean luxury = false;
        if (threeD1 == 1)
            threeD = true;
        if (luxury1 == 1)
            luxury = true;
        Theater t = new Theater(threeD, luxury, numSeats);

        String dummy = scan.nextLine(); // throw away new line character
        String title = scan.nextLine();
        t.setTitle(title);

        int basePrice = scan.nextInt();
        t.setBasePrice(basePrice);

        int N = scan.nextInt();
        for (int i = 0; i < N; ++i) {
            int numberOfSeats = scan.nextInt();
            int seatNumber = scan.nextInt();
            int totalPrice;
            if (numberOfSeats == 1)
                totalPrice = t.reserveOne(seatNumber);
            else
                totalPrice = t.reserveMultiple(numberOfSeats, seatNumber);
            if (totalPrice > 0)
                System.out.println(totalPrice);
            // t.printseats();
        }
        t.printInfo();
    }
}