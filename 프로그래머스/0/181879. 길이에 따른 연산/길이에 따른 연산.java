class Solution {
    public int solution(int[] num_list) {
        int res = 0;
        if(num_list.length >= 11) {
            for(int i = 0; i < num_list.length; i++) {
                res += num_list[i];
            }
            return res;
        }
        else {
            res = 1;
            for(int i = 0; i < num_list.length; i++) {
                res *= num_list[i];
            }
            return res;
        }
    }
}