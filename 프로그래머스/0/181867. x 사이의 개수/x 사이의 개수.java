class Solution {
    public int[] solution(String myString) {
        String[] str = myString.split("x",-1);
        int[] arr = new int[str.length];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = str[i].length();
        }
        return arr;
    }
}