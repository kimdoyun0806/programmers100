class Solution {
    public String solution(String myString) {
        String res = "";
        for(int i = 0; i < myString.length(); i++) {
            char chr = myString.charAt(i);
            if(chr == 'a' || chr == 'A') {
                chr = Character.toUpperCase(chr);
            }
            else {
                chr = Character.toLowerCase(chr);
            }
            res += chr;
        }
        return res;
    }
}