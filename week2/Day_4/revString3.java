package week2.Day_4;

class Solution {
    public void rev(char ch[], int j, int i) {
        while (i > j) {
            char c = ch[i];
            ch[i] = ch[j];
            ch[j] = c;
            i--;
            j++;
        }
    }

    public String reverseWords(String s) {
        char ch[] = s.toCharArray();

        int j = 0;

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == ' ') {
                rev(ch, j, i - 1);
                j = i + 1;
            }
        }
        rev(ch, j, ch.length - 1);

        return new String(ch);
    }
}
