class MinStack {
    Stack<int[]> st;
    int minStack = Integer.MAX_VALUE;

    public MinStack() {
        st = new Stack();
    }
    
    public void push(int value) {

        if(minStack > value)
            minStack=value;

        int[] valueArr = new int[]{value,minStack};  
       // System.out.println(valueArr[0] +" : "+valueArr[1]);  
        st.push(valueArr);

        
    }
    
    public void pop() {
        st.pop();
        
        //System.out.println("After Pop :"+st.peek()[0] +" : "+st.peek()[1]);
        if(st.isEmpty())
         minStack = Integer.MAX_VALUE;

        else
         minStack=st.peek()[1];

    }
    
    public int top() {

        return st.peek()[0];
        
    }
    
    public int getMin() {

        return st.peek()[1];
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */