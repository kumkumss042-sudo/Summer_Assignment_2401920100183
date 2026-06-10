package week2.Day_3;

class Solution {
    public int strStr(String hay, String needle) {
        int n=needle.length(),m=hay.length();
        int j=0;
        for(int i=0;i<=m-n;i++){
           while(j<n){
            if(hay.charAt(i+j)==needle.charAt(j)) j++;
            else break;
           }
           if(j==n) return i;
           else j=0;
        }
        return -1;
    }
}