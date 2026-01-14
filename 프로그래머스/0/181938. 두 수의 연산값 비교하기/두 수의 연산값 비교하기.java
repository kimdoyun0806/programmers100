class Solution {
    public int solution(int a, int b) {
        int tmp1 = Integer.parseInt(""+a+b);
        int tmp2 = 2*a*b;
        if(tmp1>=tmp2)
            return tmp1;
        else
            return tmp2;
    }
}