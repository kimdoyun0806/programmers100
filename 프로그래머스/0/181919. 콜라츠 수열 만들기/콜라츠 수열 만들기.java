import java.util.*;

class Solution {
    public List solution(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(n);
        
        while(n != 1) {
            if(n %2 == 0) {
                n = n / 2;
                arr.add(n);
            }
            else {
                n = 3 * n + 1;
                arr.add(n);
            }
        }
        return arr;
    }
}