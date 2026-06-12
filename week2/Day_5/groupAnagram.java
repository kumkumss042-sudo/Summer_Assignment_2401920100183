package week2.Day_5;
import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>mp=new HashMap<>();
        for(String str:strs){
            char ch[]=str.toCharArray();
            Arrays.sort(ch);
            String s=new String(ch);
            mp.putIfAbsent(s, new ArrayList<>());
            mp.get(s).add(str);
        }
         return new ArrayList<>(mp.values());
    }
}
