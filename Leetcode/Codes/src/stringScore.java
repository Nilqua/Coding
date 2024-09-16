public class stringScore {
    static public int scoreOfString(String s) {
        int score = 0;
        for (int i=0; i<s.length()-1; i++){
            int temp = s.charAt(i) - s.charAt(i+1);
            if (temp < 0){
                temp *= -1;
            }
            score += temp;
        }
        return score;
    }

    public static void main(String[] args) {
        String s = new String("zaz");
        System.out.println(scoreOfString(s));
    }
}