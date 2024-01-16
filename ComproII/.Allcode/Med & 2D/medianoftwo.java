import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median = 0;
        ArrayList<Integer> Mergearrr = new ArrayList<>();
        for (int i=0; i<nums1.length; i++){
            Mergearrr.add(nums1[i]);
        }
        for (int i=0; i<nums2.length; i++){
            Mergearrr.add(nums2[i]);
        }
        Collections.sort(Mergearrr);
        if (Mergearrr.size()/2 == 0){
            int pos = Mergearrr.get(Mergearrr.size()/2)+Mergearrr.get((Mergearrr.size()/2)+1);
            median = (pos)/2;
        }
        else {
            int pos = (Mergearrr.size()/2)+1;
            median = Mergearrr.get(pos);
        }
        return median;
    }
}