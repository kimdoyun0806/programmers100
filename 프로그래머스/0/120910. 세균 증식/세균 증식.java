class Solution {
    public double solution(int n, int t) {
        double answer = 0;
        answer = n * (int)Math.pow(2, t);
        return answer;
    }
}