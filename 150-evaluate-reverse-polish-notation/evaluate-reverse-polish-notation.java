class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> st = new Stack();

        for(int i=0; i<tokens.length;i++){
            String  ch = tokens[i];
           if (!ch.equals("+") && !ch.equals("-") && !ch.equals("*") && !ch.equals("/")) {
            st.push(ch);
            System.out.println(ch);
}
            else {
                int first=Integer.parseInt(st.pop());
                int second=Integer.parseInt(st.pop());
                int final1;
                if(ch.equals("+")){
                    final1=first+second;
                }
                else if(ch.equals("-"))
                    final1 = second-first;
                
                else if(ch.equals("*"))
                    final1 = second*first;

                else
                    final1=second/first;

                System.out.println("final"+final1);
                st.push(final1+"");
            }
        }

        return Integer.parseInt(st.peek());

    }
}