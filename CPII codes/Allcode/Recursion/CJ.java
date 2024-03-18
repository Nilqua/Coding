import java.util.Scanner;

class Component {
    String model;
    int socket;
    int memType;
    boolean valid;

    Component(String model, int socket, int memType){
        this.model = model;
        this.socket = socket;
        this.memType = memType;
    }
    void printInfo(){
        System.out.println(valid);
        System.out.println(model);
        System.out.println(socket);
        System.out.println(memType);
    }
    boolean isValidSpec(String model, int socket, int memType){
        if (model == null || model.length() == 0){
            return false;
        }
        if (socket <= 0){
            return false;
        }
        if (memType <= 0 || memType > 10){
            return false;
        }
        return true;
    }
} 

class CPU2 extends Component {
    int clocks;
    CPU2(String model, int clocks, int socket, int memType){
        super(model, socket, memType);
        this.clocks = clocks;
        this.valid = isValidSpec(model, clocks, socket, memType);
    }
    boolean isValidSpec(String model, int clocks, int socket, int memType){
        if (!super.isValidSpec(model, socket, memType)){
            return false;
        }
        if (clocks <= 0){
            return false;
        }
        return true;
    }
    void printInfo(){
        super.printInfo();
        System.out.println(this.clocks);
    }
}

class MainBoard2 extends Component {
    MainBoard2(String model, int socket, int memType){
        super(model, socket, memType);
        this.valid = this.isValidSpec(model, socket, memType);
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

        scan.nextLine();
        model = scan.nextLine();
        socket = scan.nextInt();
        memType = scan.nextInt();
        if (model.length() == 0 && socket % 2 == 0){
            model = null;
        }
        Component mb = new MainBoard2(model, socket, memType);
        mb.printInfo();
    }
}