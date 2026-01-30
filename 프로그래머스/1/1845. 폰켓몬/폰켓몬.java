import java.util.*;

class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(Integer num : nums) {
            set.add(num);
        }
        int length = nums.length / 2;
        
        if(length >= set.size())
            return set.size();
        else
            return length;
    }
}