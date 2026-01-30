import java.util.*;

public class Solution {
    public Deque<Integer> solution(int []arr) {
        Deque<Integer> dq = new ArrayDeque<>();
        
        dq.addLast(arr[0]);
        for(int i = 1; i<arr.length; i++) {
            int tmp = arr[i];
            if(dq.peekLast() == tmp)
                continue;
            else
                dq.addLast(tmp);
        }
        // int[] answer = new int[dq.size()];
        // for(int i = 0; i < answer.length; i++) {
        //     answer[i] = dq.pollFirst();
        // }

        return dq;
    }
}