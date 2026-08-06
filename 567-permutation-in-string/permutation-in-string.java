class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if(s2.length() < s1.length()){
            return false;
        }
        String rev = sortString(s1);
        int inputLen = s1.length();
        String substr = s2.substring(0,inputLen);

        if(rev.equals(sortString(substr)))
            return true;

        for(int i=inputLen ;i <s2.length();i++){
            substr=substr.substring(1)+s2.charAt(i);
            //System.out.println("before reverse: "+substr);
            String substr2=sortString(substr);

            //System.out.println("After reverse: "+substr);

            if(rev.equals(substr2))
                return true;
        }

        return false;

    }

    public String sortString(String input){

        char[] ch = input.toCharArray();
        Arrays.sort(ch);
        String output = new String(ch);
        return output;

    }
}