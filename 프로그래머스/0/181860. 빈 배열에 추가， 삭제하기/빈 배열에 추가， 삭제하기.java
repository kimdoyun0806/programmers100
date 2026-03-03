import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        
        for(int i = 0; i < arr.length; i++) {
            int n = arr[i];
            
            if(flag[i] == true) {
                int cnt = n * 2;
                for(int j = 0; j < cnt; j++) {
                    dq.addLast(n);
                }
            }
            else {
                for(int j = 0 ; j < n; j++) {
                    dq.pollLast();
                }
            }
        }
        return dq.stream().mapToInt(Integer::intValue).toArray();
    }
}