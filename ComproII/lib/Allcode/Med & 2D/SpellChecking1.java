import java.util.Scanner;
public class SpellChecking1 {
    static int CountMactch(String dic,String word){
        int match = 0;
        int loopcount = Integer.min(dic.length(), word.length());
        for (int i=0; i<loopcount; i++){
            if (dic.charAt(i) == word.charAt(i)){
                match++;
            }
        }
        return match;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tmp = scan.nextInt();

        String[] dic = new String[tmp];
        for (int i=0; i<tmp; i++){
            dic[i] = scan.next();
        }

        for (int i=0; i<10; i++){
            String input = scan.next();
            boolean spellcheck = false;
            String misspell = dic[0];
            for (int j=0; j<tmp; j++){
                int maxmatch = Integer.MIN_VALUE;
                if (input.equals(dic[j])){
                    spellcheck = true;
                }
                else{
                    if (CountMactch(dic[j], input) >= maxmatch){
                        misspell = dic[j];
                    }
                }
            }

            if (spellcheck){
                System.out.println(input);
            }
            else{
                System.out.println(misspell);
            }
        }
    }
}