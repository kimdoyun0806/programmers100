import java.util.*;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        for (String str : intStrs) {
            String sub = str.substring(s, s + l);
            
            int num = Integer.parseInt(sub);
            
            if (num > k) {
                arr.add(num);
            }
        }
        
        int[] res = new int[arr.size()];
        for(int i = 0; i < arr.size(); i++) {
            res[i] = arr.get(i);
        }
        return res;
        
    }
}