import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> map = new HashMap<>();
        
        for(String[] str : clothes) {
            map.put(str[1], map.getOrDefault(str[1], 0) + 1);
        }
        int res = 1;
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            res *= (entry.getValue() + 1);
        }
        return res -1;
    }
}