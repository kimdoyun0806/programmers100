class Solution {
    public int solution(int n, int w, int num) {
        int h = n / w + 1;
        int[][] arr = new int[h][w];
        int cnt = 1;
        int row = 0;
        int column = 0;
        int res = 0;
        
        for(int i = 0; i < h; i++) {
            if(i % 2 == 0) {
                for(int j = 0; j < w; j++) {
                    if(n < cnt) {
                        break;
                    }
                    if(num == cnt) {
                        row = j;
                        column = i;
                    }
                    arr[i][j] = cnt++;
                }   
            }
            else {
                for(int j = w-1; j >= 0; j--) {
                    if(n < cnt) {
                        break;
                    }
                    if(num == cnt) {
                        row = j;
                        column = i;
                    }
                    arr[i][j] = cnt++;
                }
            }
        }
        for(int i = column; i < h; i++) {
            if(arr[i][row] != 0) {
                res++;
            }
        }
        return res;
    }
}