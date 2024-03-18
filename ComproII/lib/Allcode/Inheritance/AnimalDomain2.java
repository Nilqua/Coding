import java.util.ArrayList;
import java.util.Scanner;

class Animal {
    String name;
    int lifeExpect;
    int age = 0;
    boolean vaccined = false;
    Animal(String name, int lifeExpect){
        this.name = name;
        this.lifeExpect = lifeExpect;
        System.out.println(name + " was born with life expectancy " + lifeExpect + " year(s)");
    }

    void life(int num){
        if (age == lifeExpect){
            System.out.println(name + " died earlier");
        } else if (num + age < lifeExpect){
            if (num == 1){
                System.out.println(name + " lived " + num + " more year");
            } else {   
                System.out.println(name + " lived " + num + " more years");
            }
            age += num;
        } else {
            if (lifeExpect-age == 1){
                System.out.println(name + " lived 1 more year and died");
            } else {
                System.out.println(name + " lived " + (lifeExpect-age) + " more years and died");
            }
            age = lifeExpect;
        }
    }

    boolean isAlive(){
        if (age == lifeExpect){
            System.out.println(name + " is dead");
            return false;
        } else {
            System.out.println(name + " is alive");
            return true;
        }
    }

    void vaccine(){
        System.out.println(name + "'s life expectancy is now "+ lifeExpect +" year(s)");
    }
}

class Dog extends Animal{
    Dog(String name){
        super(name, 8);
    }
    void vaccine(){
        if (!vaccined){
            vaccined = true;
            int diff = this.lifeExpect - this.age;
            this.lifeExpect +=diff;
        }
        super.vaccine();
    }
}

class Turtle extends Animal{
    Turtle(String name){
        super(name, 50);
    }
}

class Salmon extends Animal{
    Salmon(String name){
        super(name, 4);
    }
}

public class AnimalDomain2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        ArrayList<Animal> ani = new ArrayList<>(); 
        for (int i = 0; i < N; ++i) {
            int command = scan.nextInt();
            if (command == 1) {
                int type = scan.nextInt();
                String name = scan.next();
                switch (type) {
                    case 1:
                        Dog dog = new Dog(name);
                        ani.add(dog);
                        break;
                    case 2:
                        Turtle turtle = new Turtle(name);
                        ani.add(turtle);
                        break;
                    case 3:
                        Salmon salmon = new Salmon(name);
                        ani.add(salmon);
                        break;
                }

            } else if (command == 2) {
                int id = scan.nextInt()-1;
                int year = scan.nextInt();
                ani.get(id).life(year);

            } else if (command == 3) {
                int id = scan.nextInt()-1;
                ani.get(id).isAlive();

            } else if (command == 4) {
                int id = scan.nextInt()-1;
                ani.get(id).vaccine();
            }
        }
    }
}