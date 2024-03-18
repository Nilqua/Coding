import java.util.Scanner;

class Account {
    String name;
    String code;
    double balance;
    boolean active = false;

    Account(String name_in, String code_in, double balance_in) {
        name = name_in;
        code = code_in;
        balance = balance_in;
        active = true;
        System.out.println("Open account");
    }

    void printInfo() {
        System.out.println(name + ", " + code + ", " + balance + ", " + (active ? "active" : "inactive"));
    }

    double checkBalance() {
        return balance;
    }

    void closeAccount() {
        active = false;
        printInfo();
    }

    boolean deposit(double in) {
        if (active) {
            balance += in;
            System.out.println(balance + " true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }

    boolean withdrawn(double in) {
        if (active && balance - in >= 0) {
            balance -= in;
            System.out.println(balance + " true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }
}

class Saving extends Account {
    String id = "";
    String tel = "";
    boolean promptPay = false;
    Saving(String name, String code, double balance){
        super(name, code, balance);
        System.out.println("Saving account");
    }

    boolean openPromptPay(int type, String in){
        if (type == 1){
            if (in.length() == 13){
                id = in;
                promptPay = true;
                return true;
            } return false;
        } else {
            if (in.length() == 10){
                tel = in;
                promptPay = true;
                return true;
            } return false;
        }
    }

    void printInfo(){
        super.printInfo();
        if (promptPay){
            System.out.println("PromptPay"+ (id.equals("") ? "" : (", " + id)) + (tel.equals("") ? "" : (", "+tel)));
        } else {
            System.out.println("no PromptPay");
        }
    }
} 

public class BankAccount2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        String code = scan.nextLine();
        double money = scan.nextDouble();
        Saving p = new Saving(name, code, money);
        int N = scan.nextInt();
        for(int i = 0; i < N; ++i) {
            int command = scan.nextInt();
            switch (command) {
                case 1:
                    p.printInfo();
                    break;
                case 2:
                    System.out.println(p.checkBalance());
                    break;
                case 3:
                    p.closeAccount();
                    break;
                case 4:
                    double in = scan.nextDouble();
                    p.deposit(in);
                    break;
                case 5:
                    double in1 = scan.nextDouble();
                    p.withdrawn(in1);
                    break;
                case 6:
                    int subMenu = scan.nextInt();
                    String input = scan.nextLine().strip();
                    System.out.println(p.openPromptPay(subMenu, input));
            }
        }
    }
}
