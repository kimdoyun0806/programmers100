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

// 다른 사람의 문제 풀이
class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        //발음할 수 있는 단어를 1로 변환 후 마지막에 1을 빈 문자열로 변환시켜 카운팅
        for(int i =0; i < babbling.length; i++) {
            babbling[i] = babbling[i].replace("aya", "1");
            babbling[i] = babbling[i].replace("woo", "1");
            babbling[i] = babbling[i].replace("ye", "1");
            babbling[i] = babbling[i].replace("ma", "1");
            babbling[i] = babbling[i].replace("1", "");
            if(babbling[i].isEmpty()) {
                answer = answer + 1;
            }
        }

        return answer;
    }
}
