import java.util.Scanner;
import java.util.ArrayList;

class Demons {
    private String name;
    private int Hp;
    private String Background;

    public Demons(String name, int Hp, String Background) {
        this.name = name;
        this.Hp = Hp;
        this.Background = Background;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return Hp;
    }

    public String getBackground() {
        return Background;
    }

    public void setHp(int Hp) {
        this.Hp = Hp;
    }
}

class Muzan extends Demons {
    String alias, gender;
    private int muzanBlood;
    public int power;

    Muzan(String name, int[] hp, String bg, int type) {
        super(name, 0, bg);
        if (type == 0) {
            setHp(hp[0] / 2);
            muzanBlood = hp[0] / 2;
            power = (getHp()+muzanBlood) * 50;
            alias = "Child";
            gender = "Male";
        } else if (type == 1) {
            setHp(hp[1] / 2);
            muzanBlood = hp[1] / 2;
            power = (getHp()+muzanBlood) * 50;
            alias = "Geisha";
            gender = "Female";
        } else if (type == 2) {
            setHp(hp[2] / 2);
            muzanBlood = hp[2] / 2;
            power = (getHp()+muzanBlood) * 50;
            alias = "The King of Demons";
            gender = "Male";
        }
    }

    Muzan(String name) {
        super(name, 0, "Unknown");
    }

    int Blood() {
        if (muzanBlood * 0.1 >= 0) {
            double use = muzanBlood * 0.1;
            muzanBlood -= (int) use;
            return (int) use;
        }
        return 0;
    }

    void printInfo() {
        System.out.println(getName() + " ( " + alias + " )");
        System.out.println("Gender : " + gender);
        System.out.println("HP : " + getHp());
        System.out.println("Blood : " + muzanBlood);
        System.out.println("Power : " + power);
        System.out.println("Background : " + getBackground());
    }
}

class DemonMoons_UpperRanks extends Muzan {
    public int rank;

    DemonMoons_UpperRanks(String name, int rank, int blood) {
        super(name);
        this.power = rank * blood * 50;
        this.rank = rank;
    }

    void Blood(int blood) {
        this.power += blood * 50;
        setHp(getHp() + (blood * 75));
    }

    void printInfo() {
        String line = String.format("Name : %s\nUpper Rank : %d\nPower : %d\nHP : %d\nBackground : %s", getName(),
                this.rank, this.power, getHp(), getBackground());
        System.out.println(line);
    }
}

class DemonMoons_LowerRanks extends Muzan {
    public int rank;

    DemonMoons_LowerRanks(String name, int rank, int blood) {
        super(name);
        this.power = rank * blood * 25;
        this.rank = rank;
    }

    void Blood(int blood) {
        this.power += blood * 25;
        setHp(getHp() + (blood * 50));
    }

    void printInfo() {
        String line = String.format("Name : %s\nLower Ranks : %d\nPower : %d\nHP : %d\nBackground : %s", getName(),
                this.rank, this.power, getHp(), getBackground());
        System.out.println(line);
    }
}

public class TwelveDemonMoons {
    private static ArrayList<Muzan> DemonMoons = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int hp[] = new int[3];
        for (int i = 0; i < 3; i++) {
            hp[i] = scan.nextInt();
        }
        String t = scan.nextLine();
        String bg = scan.nextLine();
        int type = scan.nextInt();
        Muzan muzun = new Muzan(name, hp, bg, type);
        for (;;) {
            int type_demon = scan.nextInt();
            if (type_demon == 0) {
                break;
            } else if (type_demon > 0) {
                String n = scan.next();
                int rank = scan.nextInt();
                int blood = muzun.Blood();
                Muzan upper = new DemonMoons_UpperRanks(n, rank, blood);
                DemonMoons.add(upper);
            } else {
                String n = scan.next();
                int rank = scan.nextInt();
                int blood = muzun.Blood();
                Muzan lower = new DemonMoons_LowerRanks(n, rank, blood);
                DemonMoons.add(lower);
            }
        }
        int com = scan.nextInt();
        for (int i = 0; i < com; i++) {
            int id = scan.nextInt() - 1;
            int blood = muzun.Blood();
            if (DemonMoons.get(id) instanceof DemonMoons_UpperRanks) {
                DemonMoons_UpperRanks up = (DemonMoons_UpperRanks) DemonMoons.get(id);
                up.Blood(blood);
                DemonMoons.set(id, up);
            } else if (DemonMoons.get(id) instanceof DemonMoons_LowerRanks) {
                DemonMoons_LowerRanks low = (DemonMoons_LowerRanks) DemonMoons.get(id);
                low.Blood(blood);
                DemonMoons.set(id, low);
            }
        }
        muzun.printInfo();
        for (Muzan x : DemonMoons) {
            if (x instanceof DemonMoons_UpperRanks) {
                DemonMoons_UpperRanks up = (DemonMoons_UpperRanks) x;
                up.printInfo();
            } else if (x instanceof DemonMoons_LowerRanks) {
                DemonMoons_LowerRanks low = (DemonMoons_LowerRanks) x;
                low.printInfo();
            }
        }
    }
}