class Solution {
    public int solution(int[] arr) {
        int cnt = 0;
        boolean flag = true;
        while(flag) {
            cnt++;
            flag = false;
            
            for(int i = 0; i < arr.length; i++) {
                
                
                if(arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] /= 2;
                    flag = true;
                }
                else if(arr[i] < 50 && arr[i] % 2 != 0) {
                    arr[i] = arr[i] * 2 + 1;
                    flag = true;
                }
            }
        }
        return cnt - 1;
    }
}