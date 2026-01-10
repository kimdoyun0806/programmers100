class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        int os = overwrite_string.length();
        int ms = my_string.length();
        String str = "";
        str = my_string.substring(0,s) + overwrite_string + my_string.substring(s+os,ms);
        return str;
    }
}