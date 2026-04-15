class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        
        // 지갑 긴쪽 big, 짧은 쪽 small
        int big = Math.max(wallet[0], wallet[1]);
        int small = Math.min(wallet[0], wallet[1]);
        
        while(true) {
            // 지갑에 지폐가 들어가면 종료
            if(small >= Math.min(bill[0],bill[1]) && big >= Math.max(bill[0], bill[1])) {
                break;
            }
            
            if(bill[0] >= bill[1]) {
                bill[0] = bill[0] / 2;
            }
            else {
                bill[1] = bill[1] / 2;
            }
            answer++;
            
        }
        
        return answer;
    }
}