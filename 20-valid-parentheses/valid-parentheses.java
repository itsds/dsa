class Solution {
    public boolean isValid(String s) {
        
        if(s.length() < 2)
            return false;

        Stack<Character> st = new Stack();

        Map<Character,Character> hm = new HashMap();
        hm.put(')','(');
        hm.put(']','[');
        hm.put('}','{');

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{')
                st.push(ch);

            else{
                if(st.isEmpty())
                    return false;
                if(hm.get(ch) != st.peek())
                    return false;

                else
                    st.pop();
            }
        }

        if(st.isEmpty())
            return true;
        
        else 
            return false;
    }
}