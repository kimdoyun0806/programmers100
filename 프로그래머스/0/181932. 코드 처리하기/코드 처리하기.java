class Solution {
  
    public String solution(String code) {
        StringBuilder ret = new StringBuilder();
        int mode = 0;
        
        for(int i=0; i<code.length(); i++) {
            char idx = code.charAt(i);
          
            // mode 전환
            if(idx == '1') {         
                if(mode == 0)
                    mode = 1;
                else
                    mode = 0;
                continue;
            }
            
            
            if(i % 2 == 0 && mode == 0)
                ret.append(idx);
            else if(i % 2 != 0 && mode == 1)
                ret.append(idx);
        }
        
        return !ret.toString().isEmpty() ? ret.toString() : "EMPTY";
    }
    
    
}