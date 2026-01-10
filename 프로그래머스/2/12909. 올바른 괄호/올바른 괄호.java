import java.util.*;
import java.io.*;
class Solution {
    boolean solution(String s) {
        Deque<Character> dq = new ArrayDeque<>();
        for(char chr : s.toCharArray()) {
            if(chr =='(')
                dq.addLast(chr);
            else {
                if(dq.isEmpty())
                    return false;
                dq.pollLast();
            }
        }
        if(dq.isEmpty())
            return true;
        else
            return false;
    }
}