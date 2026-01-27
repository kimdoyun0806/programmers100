import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        ArrayList<String> arr = new ArrayList<>();
        for(int i = 0; i < my_string.length(); i++) {
            String sub = my_string.substring(i);
            arr.add(sub);
        }
        
        String[] res = arr.toArray(new String[0]);
        Arrays.sort(res);
        return res;
    }
}