class Solution {
    public int[] solution(int[] num_list) {
        int[] res = new int[num_list.length+1];
        int a = num_list[num_list.length - 1];
        int b = num_list[num_list.length - 2];
        int c = 0;
        
        if(a>b)
            c= a - b;
        else
            c = a * 2;
        
        for(int i=0; i<num_list.length; i++) {
            res[i] = num_list[i];
        }
        res[num_list.length] = c;
        return res;
    }
}