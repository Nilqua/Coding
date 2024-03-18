import java.util.Scanner;

class Dept {
    private int ministryBudget, eduFee, serviceFee, donation, salary, elec, eduCost;
    Dept (int teacher, int student){
        computeIncome(teacher, student);
        computeExpense(teacher, student);
    }
    void computeIncome (int teacher, int student){
        this.ministryBudget = (teacher*500000) + (student*3000);
        this.eduFee = (student*5000);
        this.serviceFee = 300000;
        this.donation = 100000;
    }
    void computeExpense(int teacher, int student){
        this.salary = teacher*600000;
        this.elec = (teacher+student)*2000;
        this.eduCost = student*4000;

    }
    void printReport (){
        int total_income = (ministryBudget+eduFee+serviceFee+donation);
        int total_expense = (salary+elec+eduCost);
        System.out.println("total income = " + total_income);
        System.out.println("total expense = " + total_expense);
        System.out.println("income - expense = " + (total_income-total_expense));
        System.out.println("ministry budget = " + ministryBudget);
        System.out.println("education fee = " + eduFee);
        System.out.println("service fee = " + serviceFee);
        System.out.println("donation = " + donation);
        System.out.println("salary = " + salary);
        System.out.println("electricity = " + elec);
        System.out.println("educational cost = " + eduCost);
    }

}
public class Department{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Dept temp = new Dept(scan.nextInt(), scan.nextInt());
        temp.printReport();
        scan.close();
    }
}