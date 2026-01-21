import java.io.*;
import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        int[] res = new int[queries.length];
        
        for(int i=0; i<queries.length; i++) {
            int min = Integer.MAX_VALUE;
            
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            
            for(int j = s; j<=e; j++) {
                if(arr[j] > k) {
                    min = Math.min(min, arr[j]);
                }
            }
            res[i] = min == Integer.MAX_VALUE ? -1 : min;
        }
        return res;
    }
}