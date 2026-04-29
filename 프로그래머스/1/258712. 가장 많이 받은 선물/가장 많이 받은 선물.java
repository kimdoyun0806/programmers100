import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        
        // map : 친구 인덱스 설정 ex) muzi:0, ryan:1,...
        // grid : 선물 지수 계산
        // table : 준 선물, 받은 선물 수의 표
        HashMap<String,Integer> map = new HashMap<>();
        int[] degree = new int[friends.length];
        int[][] table = new int[friends.length][friends.length];
        
        for(int i = 0; i < friends.length; i++){
            map.put(friends[i],i);
        }
        
        for(String s : gifts) {
            String[] str = s.split(" ");
            degree[map.get(str[0])]++;
            degree[map.get(str[1])]--;
            table[map.get(str[0])][map.get(str[1])]++;
        }
        
        int res = 0;
        
        for(int i = 0; i < friends.length; i++) {
            int cnt = 0;
            for(int j = 0; j < friends.length; j++) {
                if(i==j) {
                    continue;
                }
                
                if(table[i][j] > table[j][i] || (table[i][j] == table[j][i] && degree[i] > degree[j])) {
                    cnt++;
                }
            }
            if(cnt > res) {
                res = cnt;
            }
        }
        
        return res;
    }
}