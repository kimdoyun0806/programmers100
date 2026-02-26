import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        ArrayList<String> list = new ArrayList<>();
        String[] str = myStr.replaceAll("[abc]"," ").split("\\s+");
        for(String s : str) {
            if(!s.isEmpty()) {
                list.add(s);
            }
        }
        return list.isEmpty() ? new String[]{"EMPTY"} : list.toArray(new String[0]);
    }
}