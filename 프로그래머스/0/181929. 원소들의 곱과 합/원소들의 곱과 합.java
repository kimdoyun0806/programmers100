class Solution {
    public int func1(int[] arr) {
        int res = 1;
        for(int i=0; i<arr.length; i++) {
            res *= arr[i];
        }
        return res;
    }
    public int func2(int[] arr) {
        int res = 0;
        for(int i=0; i<arr.length; i++) {
            res += arr[i];
        }
        return res * res;
    }
    
    public int solution(int[] num_list) {
        return func1(num_list) > func2(num_list) ? 0 : 1;
    }
}