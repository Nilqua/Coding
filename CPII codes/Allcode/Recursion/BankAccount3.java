package Compro.Interitance.BankAccount.BankAccount3;

import java.util.Scanner;

class Account {
    String name;
    String code;
    double balance;
    boolean active = true;
    Account(String name, String code, double balance){
        this.name = name;
        this.code = code;
        this.balance = balance;
    }
    void printInfo(){
        System.out.print(name + ", " + code + ", " + balance + ", ");
        //Active
        if (active){
            System.out.println("active");
        }
        else {
            System.out.println("inactive");
        }
    }
    double checkBalance(){
        System.out.println(balance);
        return balance;
    }
    void closeAccount(){
        active = false;
        printInfo();
    }
    boolean deposit(double money){
        if (active){
            balance += money;
            System.out.println(balance + " true");           
            return true;
        }
        else {
            System.out.println("false");
            return false;
        }
    }
    boolean withdrawn(double money){
        if (active && (balance - money) >= 0){
            balance -= money;
            System.out.println(balance + " true");
            return true;
        }
        else {
            System.out.println("false");
            return false;
        }
    }
}

class Saving extends Account {
    String id;
    String tel;
    boolean promptPay = false;
    Saving(String name, String code, double balance){
        super(name, code, balance);
        //Open
        System.out.println("Open account");
        //Saving
        System.out.println("Saving account");
    }
    void printInfo(){
        super.printInfo();
        if ((promptPay) && (id != null) || (tel != null)){
            if (id != null && tel == null){
                System.out.println("PromptPay, " + id);
            }
            else if (id == null && tel != null){
                System.out.println("PromptPay, " + tel);
            }
            else {
                System.out.println("PromptPay, " + id + ", " + tel);
            }
        }
        else {
            System.out.println("no PromptPay");
        }
    }
    boolean openPromptPay(int num, String data){
        if (num == 1){
            if (data.length() == 13){
                id = data;
                promptPay = true;
            }
            else {
                promptPay = false;
            }
        }
        if (num == 2){
            if (data.length() == 10){
                tel = data;
                promptPay = true;
            }
            else {
                promptPay = false;
            }
        }
        return promptPay;
    }
}

class FixedDeposit extends Account {
    double fixedAmount;
    FixedDeposit(String name, String code, double balance, double fixedAmount){
        super(name, code, balance);
        this.fixedAmount = fixedAmount;
        //FixedAmount
        System.out.println("Open account\n" + "FixedDeposit account with " + fixedAmount);
    }
    boolean deposit(double money){
        if (active){
            if (money >= fixedAmount){
                balance += money;
                System.out.println(balance + " true");
                return true;
            }
            else if (money < fixedAmount){
                System.out.println("deposit less than " + fixedAmount + " false");
                return false;
            }
        }
        else {
            System.out.println("false");
        }
        return false;
    }
}

class CurrentAccount extends Account {
    double overDraft;
    CurrentAccount(String name, String code, double balance, double overDraft){
        super(name, code, balance);
        this.overDraft = overDraft;
        //OverDraft
        System.out.println("Open account\n" + "Current account with overdraft " + overDraft);
    }
    boolean withdrawn(double money){
        if (active){
            if ((balance - money) < (overDraft * -1)){
                System.out.println("false");
                return false;
            }
            else if ((balance - money) >= 0){
                balance -= money;
                System.out.println(balance + " true");
                return true;
            }
            else {
                balance -= money;
                System.out.println(balance + " overdraft true");
                return true;
            }
        }
        else {
            System.out.println("false");
        }
        return false;
    }
}

public class BankAccount3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Saving sAcc = null;
        FixedDeposit fAcc = null;
        CurrentAccount cAcc = null;
        for (int typeAccount = 1; typeAccount <= 3; typeAccount++){
            String name = scan.nextLine();
            String code = scan.nextLine();
            double money1 = scan.nextDouble();
            if (typeAccount == 1){
                scan.nextLine();
                sAcc = new Saving(name, code, money1);
            }
            else if (typeAccount == 2){
                double money2 = scan.nextDouble();
                scan.nextLine();
                fAcc = new FixedDeposit(name, code, money1, money2);
            }
            else if (typeAccount == 3){
                double money2 = scan.nextDouble();
                scan.nextLine();
                cAcc = new CurrentAccount(name, code, money1, money2);
            }
        }
        int N = scan.nextInt();
        for (int i = 0; i < N; i++){
            int type = scan.nextInt();
            //Saving Account
            if (type == 1){
                int command = scan.nextInt();
                if (command == 1){
                    sAcc.printInfo();
                }
                else if (command == 2){
                    sAcc.checkBalance();
                }
                else if (command == 3){
                    sAcc.closeAccount();
                }
                else if (command == 4){
                    double income = scan.nextDouble();
                    sAcc.deposit(income);
                }
                else if (command == 5){
                    double withdrawn = scan.nextDouble();
                    sAcc.withdrawn(withdrawn);
                }
                else if (command == 6){
                    int num = scan.nextInt();
                    String data = scan.next();
                    System.out.println(sAcc.openPromptPay(num, data));
                }
            }
            //FixedDeposit
            else if (type == 2){
                int command = scan.nextInt();
                if (command == 1){
                    fAcc.printInfo();
                }
                else if (command == 2){
                    fAcc.checkBalance();
                }
                else if (command == 3){
                    fAcc.closeAccount();
                }
                else if (command == 4){
                    double incoome = scan.nextDouble();
                    fAcc.deposit(incoome);
                }
                else if (command == 5){
                    double withdrawn = scan.nextDouble();
                    fAcc.withdrawn(withdrawn);
                }
            }
            //CurrentAccoun
            else if (type == 3){
                int command = scan.nextInt();
                if (command == 1){
                    cAcc.printInfo();
                }
                else if (command == 2){
                    cAcc.checkBalance();
                }
                else if (command == 3){
                    cAcc.closeAccount();
                }
                else if (command == 4){
                    double incoome = scan.nextDouble();
                    cAcc.deposit(incoome);
                }
                else if (command == 5){
                    double withdrawn = scan.nextDouble();
                    cAcc.withdrawn(withdrawn);
                }
            }
        }
    }
}