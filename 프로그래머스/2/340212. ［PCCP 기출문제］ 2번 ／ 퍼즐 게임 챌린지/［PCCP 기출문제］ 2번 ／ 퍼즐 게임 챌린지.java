class Solution {
    
     static boolean impossible(int[] diffs, int[] times, long level, long limit) {
        long t = times[0];
        
        for(int i =1; i<times.length; i++){
            if(diffs[i] > level){
                t += (times[i-1] + times[i]) * (diffs[i] - level) + times[i];
            }
            else {
                t += times[i];
            }
        }
        
        return limit < t;
    }
    
    public int solution(int[] diffs, int[] times, long limit) {
        long left = 1;
        long right = limit;
        
        while(left < right) {
            long mid = (left + right) / 2;
            if(impossible(diffs, times, mid, limit)) {
                left = mid + 1;
            }
            else {
                right = mid;
            }
        }
        return (int)left;
    }
}