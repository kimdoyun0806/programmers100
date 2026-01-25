import java.util.*;

class Solution {
    public String solution(String my_string, int[] index_list) {
        StringBuilder sb = new StringBuilder();
        ArrayList<Character> arr = new ArrayList<>(); 
        
        for(char c : my_string.toCharArray()) {
            arr.add(c);
        }
        
        for(Integer i : index_list)
            sb.append(arr.get(i));
            
        return sb.toString();
        }
}