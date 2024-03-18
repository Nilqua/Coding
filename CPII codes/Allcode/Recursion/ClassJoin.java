import java.util.Scanner;

class Component {
    String model;
    int socket;
    int memtype;
    boolean valid;

    boolean isValidSpec(String name, int socket, int memtype) {
        if (model == null || model.length() == 0){
            return false;
        }
        if (socket <= 0){
            return false;
        }
        if (memtype <=0 || memtype > 10){
            return false;
        }
        return true;
    }

    Component(String name, int socket, int memtype) {
        this.model = name;
        this.socket = socket;
        this.memtype = memtype;
    }

    void printInfo() {
        System.out.println(valid);
        System.out.println(model);
        System.out.println(socket);
        System.out.println(memtype);
    }
}

class Mainboard2 extends Component {
    Mainboard2(String name, int socket, int memtype) {
        super(name, socket, memtype);
        this.valid = isValidSpec(name,socket,memtype);
    }
}

class CPU2 extends Component {
    int clock;

    @Override
    void printInfo() {
        super.printInfo();
        System.out.println(this.clock);
    }

    @Override
    boolean isValidSpec(String name, int socket, int memtype) {
        if (!super.isValidSpec(name,socket,memtype)) {
            return false;
        }
        if(clock <= 0){
            return false;
        }
        return true;
    }

    CPU2(String name, int socket, int memtype, int clock) {
        super(name, socket, memtype);
        this.clock = clock;
        this.valid = isValidSpec(name,socket,memtype);
    }
}

public class ClassJoin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String model = scan.nextLine();
        int clocks = scan.nextInt();
        int socket = scan.nextInt();
        int memType = scan.nextInt();
        if (model.length() == 0 && socket % 2 == 0)
            model = null;
        Component cpu = new CPU2(model, clocks, socket, memType);
        cpu.printInfo();
        scan.nextLine(); // skip new line character
        model = scan.nextLine();
        socket = scan.nextInt();
        memType = scan.nextInt();
        if (model.length() == 0 && socket % 2 == 0)
            model = null;
        Component mb = new Mainboard2(model, socket, memType);
        mb.printInfo();
    }
}