import java.util.*;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();
        String str = br.readLine();
        for(int i=0; i<str.length(); i++) {
            char chr = str.charAt(i);
            sb.append(chr).append("\n");
        }
        System.out.println(sb);
    }
}