import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        ArrayList<String> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(my_string," ");
        while(st.hasMoreTokens()) {
            list.add(st.nextToken());
        }
        return list.toArray(new String[0]);
    }
}