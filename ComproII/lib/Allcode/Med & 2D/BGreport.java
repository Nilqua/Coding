import java.util.Scanner;

public class BGreport {
    static void report(String name, int B_date, int S_date){
        boolean B = false;
        if (name.length() >= 2){
            System.out.println("Name: "+ name);
        }
        else{
            System.out.println("Name: INVALID");
        }

        if (B_date >= 1900 && B_date <= 2022){
            System.out.println("Birth year: " + B_date);
        }
        else{
            System.out.println("Birth year: INVALID");
            B = true;
        }
        if(B){
            System.out.println("Start year: INVALID");
            return;
        }
        if (S_date-B_date >= 18 && (S_date >= 1900 && S_date <= 2022)){
            System.out.println("Start year: " + S_date);
        }
        else{
            System.out.println("Start year: INVALID");
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        int birthYear = scan.nextInt();
        int startYear = scan.nextInt();
        report(name, birthYear, startYear);
    }
}
