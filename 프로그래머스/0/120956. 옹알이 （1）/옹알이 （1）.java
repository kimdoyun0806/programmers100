class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] word = {"aya", "ye", "woo", "ma"};
        for (String str : babbling) {
            for(String w : word) {
                if(str.contains(w)) {
                    str = str.replace(w, " ");
                }
            }
            str = str.replace(" ", "");
            if(str.equals(""))
                answer++;
        }
        return answer;
    }
}