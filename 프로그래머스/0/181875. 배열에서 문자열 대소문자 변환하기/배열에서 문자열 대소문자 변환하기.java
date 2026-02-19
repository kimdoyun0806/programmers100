import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < strArr.length; i++) {
            if(i % 2 == 0) {
                
                list.add(strArr[i].toLowerCase());
            }
            else {
                String str = strArr[i];
                list.add(strArr[i].toUpperCase());
            }
        }
        String[] res = list.toArray(new String[0]);
        return res;
    }
}