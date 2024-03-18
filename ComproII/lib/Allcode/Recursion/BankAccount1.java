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

public class BankAccount1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        String code = scan.nextLine();
        double money = scan.nextDouble();
        Account p1 = new Account(name, code, money);
        int N = scan.nextInt();
        for (int i = 0; i < N; ++i) {
            int command = scan.nextInt();
            switch (command) {
                case 1:
                    p1.printInfo();
                    break;
                case 2:
                    System.out.println(p1.checkBalance());
                    break;
                case 3:
                    p1.closeAccount();
                    break;
                case 4:
                    double in = scan.nextDouble();
                    p1.deposit(in);
                    break;
                case 5:
                    double in1 = scan.nextDouble();
                    p1.withdrawn(in1);
                    break;
            }
        }
    }
}
