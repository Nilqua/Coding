package Class.Hard_Level;
import java.util.ArrayList;
import java.util.Scanner;

class Kaiju {
    private String name = "Unknown";
    private String Category = "Unknown";
    private int Height;
    private int Weight;
    private ArrayList<String> Power = new ArrayList<>();
    private String Description = "Unknown";

    Kaiju(String name, String Category, int Height, int Weight, String[] Power, String Description) {
        this.name = name;
        this.Category = Category;
        this.Height = Height;
        this.Weight = Weight;
        for (String i : Power) {
            this.Power.add(i);
        }
        this.Description = Description;
    }

    Kaiju() {
    }

    Kaiju(String name) {
        this.name = name;
    }

    void PrintDetail() {
        System.out.println("Kaiju : " + name);
        System.out.println("< Category: Category " + Category + " >");

        if (Height == 0) {
            System.out.println("Height: Unknown");
        } else {
            double meter_Height = Height / 3.2808;
            System.out.println("Height: " + Height + " feet (" + meter_Height + " meters)");
        }

        if (Weight == 0) {
            System.out.println("Weight: Unknown");
        } else {
            System.out.println("Weight: " + Weight + " tons");
        }

        if (Power.size() == 0) {
            System.out.println("Power: Unknown");
        } else {
            System.out.println("Power: [" + Power.size() + "] :");
            for (String i : Power) {
                System.out.println(i);
            }
        }
        System.out.println("Description: " + Description);
    }
}

class Jaeger {
    private String name = "Unknown";
    private String CoO = "Unknown";
    private int mark;
    private double h;
    private ArrayList<String> strp = new ArrayList<>();
    private ArrayList<String> strw = new ArrayList<>();

    Jaeger() {
    }

    Jaeger(String name) {
        this.name = name;
    }

    Jaeger(String name, String CoO, int mark, double h, String[] strp, String[] strw) {
        this.name = name;
        this.CoO = CoO;
        this.mark = mark;
        this.h = h;
        for (String i : strp) {
            this.strp.add(i);
        }
        for (String i : strw) {
            this.strw.add(i);
        }
    }

    void PrintDetail() {
        System.out.println("Jaegers : " + name);
        System.out.println("< Country of Origin: " + CoO + " >");
        if (mark == 0) {
            System.out.println("< Mark: Unknown >");
        } else {
            System.out.println("< Mark: Mark-" + mark + " >");
        }
        if (h == 0) {
            System.out.println("Height: Unknown");
        } else {
            String temp = new String(Double.toString(h));
            System.out.println("Height: " + temp + " meters");
        }
        if (strp.size() == 0) {
            System.out.println("Pilots: Unknown");
        } else {
            System.out.println("Pilots: [" + strp.size() + "] :");
            for (String i : strp) {
                System.out.println(i);
            }
        }
        if (strw.size() == 0) {
            System.out.println("Weapons: Unknown");
        } else {
            System.out.println("Weapons: [" + strw.size() + "] :");
            for (String i : strw) {
                System.out.println(i);
            }
        }
    }
}

public class Pacific_Rim {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Jaeger j = null;
        Kaiju k = null;
        int typeK = scan.nextInt();
        if (typeK == 0) {
            k = new Kaiju();
        } else if (typeK == 1) {
            String name = scan.next();
            k = new Kaiju(name);
        } else if (typeK == 2) {
            String name = scan.next();
            String Category = scan.next();
            int Height = scan.nextInt();
            int Weight = scan.nextInt();
            String strp = scan.nextLine();
            strp = scan.nextLine();
            String Power[] = strp.split(",");
            String Description = scan.nextLine();
            k = new Kaiju(name, Category, Height, Weight, Power, Description);
        }
        int typeJ = scan.nextInt();
        if (typeJ == 0) {
            j = new Jaeger();
        } else if (typeJ == 1) {
            String t = scan.nextLine();
            String name = scan.nextLine();
            j = new Jaeger(name);
        } else if (typeJ == 2) {
            String temp = scan.nextLine();
            String name = scan.nextLine();
            String CoO = scan.nextLine();
            int mark = scan.nextInt();
            double h = scan.nextDouble();
            temp = scan.nextLine();
            String str = scan.nextLine();
            String strp[] = str.split(",");
            String str2 = scan.nextLine();
            String strw[] = str2.split(",");
            j = new Jaeger(name, CoO, mark, h, strp, strw);
        }
        System.out.println("====================");
        j.PrintDetail();
        System.out.println("VS");
        k.PrintDetail();
        System.out.println("====================");
        scan.close;
    }
}