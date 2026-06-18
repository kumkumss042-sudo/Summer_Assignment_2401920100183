package week3.Day_3;

import java.util.*;
class MinStack {
     Stack<Integer>st=new Stack<>();
     Stack<Integer>min=new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int value) {
        if(st.isEmpty()){
            st.push(value);
            min.push(value);
        }
        else{
            st.push(value);
            if(value<min.peek()) min.push(value);
            else min.push(min.peek());
        }
    }
    
    public void pop() {
        st.pop();
        min.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}

