class Solution {
    public String solution(int[] numLog) {
        StringBuilder sb = new StringBuilder();
        int start = numLog[0];
        for(int i=1; i<numLog.length; i++) {
            if(start + 1 == numLog[i])
                sb.append("w");
            else if(start - 1 == numLog[i])
                sb.append("s");
            else if(start + 10 == numLog[i])
                sb.append("d");
            else
                sb.append("a");
            start = numLog[i];
        }
        
        return sb.toString();
    }
}