import java.util.ArrayList;
import java.util.Scanner;

class Animal {
    String name;
    int lifeExpect;
    int age = 0;
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

}

public class AnimalDomain1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        ArrayList<Animal> ani = new ArrayList<>(); 
        for (int i = 0; i < N; ++i) {
            int type = scan.nextInt();
            if (type == 1) {
                String name = scan.next();
                int lifeExpect = scan.nextInt();

                Animal temp = new Animal(name, lifeExpect);
                ani.add(temp);

            } else if (type == 2) {
                int id = scan.nextInt()-1;
                int year = scan.nextInt();
                ani.get(id).life(year);

            } else if (type == 3) {
                int id = scan.nextInt()-1;
                ani.get(id).isAlive();

            }
        }
    }
}