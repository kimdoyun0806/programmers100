import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++) {
            int n = arr[i];
            for(int j = 0; j < n; j++) {
                list.add(n);
            }
        }
        int[] X = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            X[i] = list.get(i);
        }
        return X;
    }
}