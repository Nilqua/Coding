import java.util.Scanner;

public class ProcessInfo {
    static boolean listProcesses (String[] process, int[] ram_used, int total_ram){
        boolean is_enough_ram = false;
        int sum_ram =0;
        for(int i=0; i<process.length; i++){
            sum_ram += ram_used[i];
            if (ram_used[i] >= 10){
                System.out.println(process[i] + "* " + ram_used[i]);
            }
            else{
                System.out.println(process[i] + " " + ram_used[i]);
            }
        }
        System.out.println("RAM used = " + sum_ram +  " out of " + total_ram);
        if (sum_ram <= total_ram){
            is_enough_ram = true;
        }
        return is_enough_ram;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        String[] process = new String[k];
        int[] ram_used = new int[k];
        for (int i=0; i<k; i++){
            process[i] = new String(scan.next());
            ram_used[i] = scan.nextInt();
        }
        int total_ram = scan.nextInt();

        if (listProcesses(process, ram_used, total_ram)) {
            System.out.println("Sufficient RAM");
        }
        else{
            System.out.println("Not enough RAM");
        }
    }
}
