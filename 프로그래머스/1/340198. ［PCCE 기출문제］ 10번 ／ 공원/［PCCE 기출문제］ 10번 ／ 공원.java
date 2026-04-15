import java.util.*;
class Solution {
    
    public boolean place(String[][] park, int r, int c, int size) {
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                if(!park[i + r][j + c].equals("-1")) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public int solution(int[] mats, String[][] park) {
        
        // 내림차순 정렬
        Arrays.sort(mats);
        for(int i = 0; i < mats.length / 2; i++) {
            int tmp = mats[i];
            mats[i] = mats[mats.length - 1 - i];
            mats[mats.length - 1 - i] = tmp;
        }
        
        int r = park.length;
        int c = park[0].length;
        
        for(int size : mats) {
            for(int i = 0; i <= r - size; i++) {
                for(int j = 0; j <= c - size; j++) {
                    if(place(park, i, j, size)) {
                        return size;
                    }
                }
            }
        }
        return -1;      
    }
}