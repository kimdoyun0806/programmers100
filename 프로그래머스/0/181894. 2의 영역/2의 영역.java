import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 2) {
                min = Math.min(min, i);
                max = Math.max(max, i);
            }
        }
        
        if(min == Integer.MAX_VALUE) {
            return new int[]{-1};
        }
        
        for(int i = min; i <= max; i++) {
            list.add(arr[i]);
        }
        
        int[] res = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}