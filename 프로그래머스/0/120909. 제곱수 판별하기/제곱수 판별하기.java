class Solution {
    public int solution(int n) {
        for(int i = 0; i < 1000000; i++) {
            if(n == Math.pow(i,2))
                return 1;
        }
        return 2;
    }
}