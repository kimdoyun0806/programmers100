import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        ArrayList<Integer> list = new ArrayList<>();
        
        int[] first = Arrays.copyOfRange(num_list, n, num_list.length);
        int[] second = Arrays.copyOfRange(num_list, 0, n);


        for(int i = 0; i < first.length; i++) {
            list.add(first[i]);
        }
        for(int i = 0; i < second.length; i++) {
            list.add(second[i]);
        }

        int[] result = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        
        return result;
    }
}