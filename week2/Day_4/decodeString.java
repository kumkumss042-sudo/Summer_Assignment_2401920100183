package week2.Day_4;

import java.util.*;
class Solution {
    public String decodeString(String s) {

        Stack<Integer> count= new Stack<>();
        Stack<String> string= new Stack<>();

        String curr = "";
        int num = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            }

            else if (ch == '[') {
                count.push(num);
                string.push(curr);

                num = 0;
                curr = "";
            }

            else if (ch == ']') {

                int repeat = count.pop();
                String prev = string.pop();

                StringBuilder sb = new StringBuilder(prev);

                while (repeat-- > 0) {
                    sb.append(curr);
                }

                curr = sb.toString();
            }

            else {
                curr += ch;
            }
        }

        return curr;
    }
}