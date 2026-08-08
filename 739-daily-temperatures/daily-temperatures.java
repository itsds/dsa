class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        if(temperatures.length==1)
            return temperatures;
        
        Stack<Integer> st = new Stack();

        int[] result = new int[temperatures.length];
        st.push(temperatures.length-1);
        result[temperatures.length-1]=0;

        for(int i=temperatures.length-2 ; i>=0 ;i--){
            if(temperatures[st.peek()] <= temperatures[i]){
                while(!st.isEmpty() && temperatures[st.peek()] <= temperatures[i]){
                    st.pop();
                } 
            }
            if(st.isEmpty()){
                    result[i]=0;
            }
            else {
                    result[i]=st.peek()-i;
            }
            st.push(i);
        }

        return result;
    }
}