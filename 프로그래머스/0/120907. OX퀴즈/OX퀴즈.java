class Solution {
    public String[] solution(String[] quiz) {
        int x = 0;
        int y = 0;
        int z = 0;
        String[] answer = new String[quiz.length];
        String[] str = new String[quiz.length];
        for(int i = 0; i < quiz.length; i++) {
            str = quiz[i].split(" ");
            x = Integer.parseInt(str[0]);
            y = Integer.parseInt(str[2]);
            z = Integer.parseInt(str[4]);
            
            if(str[1].equals("-")) {
                if( (x - y) == z)
                    answer[i] = "O";
                else
                    answer[i] = "X";
            }
            if(str[1].equals("+")) {
                if( (x + y) == z)
                    answer[i] = "O";
                else
                    answer[i] = "X";
            }
        }   
        return answer;
    }
}