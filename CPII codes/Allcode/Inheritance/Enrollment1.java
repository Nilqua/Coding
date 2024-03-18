import java.util.ArrayList;
import java.util.Scanner;

class Course {
    String subject;
    int maxStu;
    int stuIncome = 0;
    boolean firstTime = true;
    ArrayList<Integer> array = new ArrayList<>();

    Course(String subject, int maxStu) {
        this.subject = subject;
        this.maxStu = maxStu;

    }

    boolean enroll(int id) {
        if (firstTime){
            array.add(id);
            firstTime = false;
        }
    }

    void printInfo() {
        System.out.println(subject + " " + stuIncome);
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }
    }
}

public class Enrollment1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        int student = scan.nextInt();
        int K = scan.nextInt();
        Course course = new Course(name, student);
        for (int i = 0; i < K; i++) {
            int id = scan.nextInt();
            System.out.println(course.enroll(id));
        }
        course.printInfo();
    }
}