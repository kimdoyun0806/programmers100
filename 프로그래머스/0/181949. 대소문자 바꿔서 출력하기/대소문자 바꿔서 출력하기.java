import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        for(int i=0; i<str.length(); i++) {
            char chr = str.charAt(i);
            if(Character.isUpperCase(chr))
                sb.append(Character.toLowerCase(chr));
            else
                sb.append(Character.toUpperCase(chr));
        }
        System.out.println(sb);
       
    }
}