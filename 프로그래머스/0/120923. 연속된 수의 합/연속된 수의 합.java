class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int first;
        //등차수열의 합 공식을 이용
        first = (total/num) - ((num-1) / 2);
        for(int i=0; i<num; i++) {
            answer[i] = first;
            first++;
        }
        return answer;
    }
}