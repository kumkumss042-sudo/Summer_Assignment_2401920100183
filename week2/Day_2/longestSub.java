package week2.Day_2;
import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0,maxlen=0;
      HashSet<Character>st=new HashSet<>();
      for(int i=0;i<s.length();i++){
        while(st.contains(s.charAt(i))){
            st.remove(s.charAt(left));
            left++;
        }
        st.add(s.charAt(i));
        maxlen=Math.max(maxlen,i-left+1);
      }
      return maxlen;
    }
}
