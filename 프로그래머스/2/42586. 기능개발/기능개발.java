import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Deque<Integer> dq = new ArrayDeque<>();
        ArrayList<Integer> list = new ArrayList<>();
        int cnt = 1;
        for(int i = 0; i < progresses.length; i++) {
            if((100 - progresses[i]) % speeds[i] == 0)
                dq.addLast( (100 - progresses[i] ) / speeds[i]);
            else
                dq.addLast( (100 - progresses[i] ) / speeds[i] + 1);
        }
        
        int num = dq.pollFirst();
        while(!dq.isEmpty()) {
            if(num >= dq.peekFirst()) {
                dq.pollFirst();
                cnt++;
            }
            else {
                list.add(cnt);
                cnt = 1;
                num = dq.pollFirst();
            }
        }
        list.add(cnt);
        
        int[] res = new int[list.size()];
        
        for(int i = 0; i < res.length; i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}