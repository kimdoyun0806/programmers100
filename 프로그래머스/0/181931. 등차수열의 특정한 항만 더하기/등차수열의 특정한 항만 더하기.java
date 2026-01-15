class Solution {
    public int solution(int a, int d, boolean[] included) {
        int sum = 0;
        int N = included.length;
        int[] arr = new int[N];
        arr[0] = a;
        
        for(int i = 1; i < N; i++) {
            a += d;
            arr[i] = a;
        }
        for(int i=0; i<N; i++) {
            if(included[i] == true)
                sum+=arr[i];
        }
        return sum;
    }
}