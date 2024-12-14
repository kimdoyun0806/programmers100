class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        String A_copy = A;
        for(int i=0; i<B.length(); i++) {
            if(A_copy.equals(B))
                return answer;
            // 문자열 A의 맨 뒷 문자를 가져온다
            String a = A_copy.substring(A.length()-1);
            // 가져온 문자 + 문자열
            A_copy = a + A_copy.substring(0,A.length()-1);
            answer++;
        }
        return -1;
    }
}

//다른 사람의 문제 풀이
class Solution {
    public int solution(String A, String B) {
        return (B+B).indexOf(A);
    }
}
