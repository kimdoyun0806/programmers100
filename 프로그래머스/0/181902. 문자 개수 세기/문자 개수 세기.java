class Solution {
    public int[] solution(String my_string) {
        int[] arr = new int[52];
        
        for(int i = 0; i < my_string.length(); i++) {
            char chr = my_string.charAt(i);
            
            if(chr >= 'A' && chr <= 'Z') {
                arr[chr - 'A']++;
            }
            else {
                arr[chr - 'a' + 26]++;
            }
        }
        return arr;
    }
}