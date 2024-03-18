import java.util.*;

public class SupremeMax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] supreme = new int[scan.nextInt()];
        
        //Adding an array
        int round = 0;
        for (int i=0; i<supreme.length; i++){
            supreme[i] = scan.nextInt();
            if (supreme[i] == 0){
                round++;
            }
        }

        //Find all max possible
        ArrayList<Integer> MaxInRound_temp = new ArrayList<>();
        ArrayList<Integer> Max_pos = new ArrayList<>();
        int current_pos = 0 ;
        int j=0;
        for (int i=0; i<round; i++){
            int Max_temp = -1;
            Max_pos.add(current_pos);
            for (j=current_pos; supreme[j]!=0; j++){
                if (supreme[j] >= Max_temp){
                    Max_temp = supreme[j];
                }
            }
            MaxInRound_temp.add(Max_temp);
            current_pos = j+1;
        }

        //Creating an array from Max arraylist
        int[] Maxinround = new int[MaxInRound_temp.toArray().length];
        for (int i=0; i<round; i++){
            Maxinround[i] = MaxInRound_temp.get(i);
        }
        
        //Find all the value from Max round
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i=Max_pos.get(MaxInRound_temp.indexOf(Arrays.stream(Maxinround).max().getAsInt())); supreme[i]!=0; i++){
            temp.add(supreme[i]);
        }

        //IDK why -1 were there but I remove it and print all the possible max arrayslist
        for(int i=0; i<MaxInRound_temp.size(); i++){
            MaxInRound_temp.removeAll(Arrays.asList(-1));
            System.out.print(MaxInRound_temp.get(i) + " ");
        }
        System.out.println();
        //Print all valur from Max round
        System.out.println(Arrays.stream(Maxinround).max().getAsInt());
        for (int i=0; i<temp.size(); i++){
            System.out.print(temp.get(i) + " ");
        }
    }
}
