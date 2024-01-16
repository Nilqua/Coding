package Class;
import java.util.Scanner;

class ZooTicket {
    String owner_name;
    int price = 100;
    private boolean ride = false;
    private boolean seal = false;
    private boolean tiger = false;

    ZooTicket(String name){
        this.owner_name = name;
    }
    void bookRide(){
        price += 40;
        ride = true; 
    }
    void bookSealShow(){
        price += 50;
        seal = true;
    }
    void bookTigerShow(){
        price += 65;
        tiger = true;
    }

    void summarize(){
        System.out.println(owner_name);
        if (ride){System.out.println("Ride");}
        if (seal){System.out.println("Seal");}
        if (tiger){System.out.println("Tiger");}
        System.out.println(price);
    }

    boolean useRide(){
        if (ride){
            System.out.println("okay");
            ride = false;
            return true;
        }
        else{
            System.out.println("no");
            return false;
        }
    }
    boolean enterSealShow(){
        if (seal){
            System.out.println("okay");
            seal = false;
            return true;
        }
        else{
            System.out.println("no");
            return false;
        }
    }
    boolean enterTigerShow(){
        if (tiger){
            System.out.println("okay");
            tiger = false;
            return true;
        }
        else{
            System.out.println("no");
            return false;
        }
    }
}

public class Zoo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ZooTicket ticket = new ZooTicket(scan.next());
        while(true){
            int action = scan.nextInt();
            if (action == 0 ){break;}
            else if (action == 1){
                ticket.bookRide();
            }
            else if (action == 2){
                ticket.bookSealShow();
            }
            else if (action == 3){
                ticket.bookTigerShow();
            }
        }
        ticket.summarize();
        int loop_count = scan.nextInt();
        for (int i=0; i<loop_count; i++){
            int use = scan.nextInt();
            if (use == 1){
                System.out.println(ticket.useRide());
            }
            else if (use == 2){
                System.out.println(ticket.enterSealShow());
            }
            else{
                System.out.println(ticket.enterTigerShow());
            }
        }
        scan.close();
    }
}
