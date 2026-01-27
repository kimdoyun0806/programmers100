class Solution {
    public int solution(String my_string, String is_suffix) {
        for(int i = 0; i < my_string.length(); i++) {
            String sub = my_string.substring(i);
            if(sub.equals(is_suffix))
                return 1;
        }
        return 0;
    }
}