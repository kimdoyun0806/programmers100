class Solution {
    public int solution(int[] common) {
        int answer = 0;
        //두 번째 원소 - 첫 번째 원소 == 마지막 원소 - 마지막에서 두 번째 원소 -> 등차수열
        //두 번째 원소 / 첫 번째 원소 == 마지막 원소 / 마지막에서 두 번째 원소 -> 등비수열
        //등차수열 계산
        if(common[1] - common[0] == common[common.length-1] - common[common.length-2]) {
            answer = common[common.length-1] + (common[1] - common[0]);
        }
        //등비수열 계산
        else {
            answer = common[common.length-1] * (common[1] / common[0]);
        }
        return answer;
    }
}