class Solution {
    public int solution(int a, int b) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        
        sb1.append(a).append(b);
        sb2.append(b).append(a);
        if(Integer.parseInt(sb1.toString())>=Integer.parseInt(sb2.toString()))
            return Integer.parseInt(sb1.toString());
        else
            return Integer.parseInt(sb2.toString());
    }
}