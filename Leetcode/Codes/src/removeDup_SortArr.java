public class removeDup_SortArr {
    static public int removeDuplicates(int[] nums) {

        int first = 1;
        for (int i = 1; i < nums.length; i++){
            if (nums[i] != nums[i-1]){
                nums[first] = nums[i];
                first++;
            }
        }
        return first;
    }

    public static void main(String[] args) {
        int[] n = { 1,1,2 };
        System.out.println(removeDuplicates(n));
    }
}