package Summer_Assignment_2401920100183.week1.Day_5;

class Solution {
    public boolean isAlphaNumeric(char ch){
        if((ch>='0' && ch<='9') || (Character.toLowerCase(ch)>='a' && Character.toLowerCase(ch)<='z')) return true;
        else return false;
    }
    public boolean isPalindrome(String s) {
        int i=0,j=s.length()-1;
        while(j>i){
            if(!isAlphaNumeric(s.charAt(i))){
                i++;
                continue;
            }
            if(!isAlphaNumeric(s.charAt(j))){
                j--;
                continue;
            }
            if(Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(j))) return false;
            i++;j--;

        }
        return true;
    }
}