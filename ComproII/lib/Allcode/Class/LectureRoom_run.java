import java.util.ArrayList;
import java.util.Scanner;

class LectRoom{
    public String name;
    public int classCode, capacity, currentSeats;
    LectRoom(int classCode, String name, int capacity){
        this.classCode = classCode;
        this.name = name;
        this.capacity = capacity;
    }
    boolean reserveSeats(int seats){
        if (currentSeats+seats > capacity){
            return false;
        } else {
            this.currentSeats += seats;
            return true;
        }
    }
}
public class LectureRoom_run {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<LectRoom> rooms = new ArrayList<>();
        int loop_count = scan.nextInt();
        for (int i=0; i<loop_count; i++){
            LectRoom temp = new LectRoom(scan.nextInt(), scan.next(), scan.nextInt());
            rooms.add(temp);
        }
        loop_count = scan.nextInt();
        for (int i=0; i<loop_count; i++){
            int cCode = scan.nextInt();
            int wanted_seats = scan.nextInt();
            boolean not_found = true;

            for (int j=0; j<rooms.size(); j++){
                if (rooms.get(j).classCode == cCode){
                    System.out.println("Checking : " +rooms.get(j).classCode + " == " + cCode);
                    if (rooms.get(j).reserveSeats(wanted_seats)){
                        System.out.println(rooms.get(i).name);
                    } else {
                        System.out.println("sorry");
                    }
                    not_found = false;
                }
            }
            if (not_found){
                System.out.println("sorry");
            }
        }
    }
}
