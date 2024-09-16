import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;;

class Animal{
    String name;
    int age;
    Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    void Say(){
        System.out.println("I'am " + name);
    }
}

public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        ArrayList<Animal> list = new ArrayList<>();
        Animal temp = new Animal((Integer.toString(rand.nextInt())), rand.nextInt(100));
        list.add(temp);

        System.out.println(list.get(0).name);
        System.out.println(list.get(0).age);
        list.get(0).Say();
        scan.close();
    }
}