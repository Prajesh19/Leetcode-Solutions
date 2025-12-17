class Solution {
    public String longestPalindrome(String s) {
        if(s==null || s.length()<1) return "";
        int start=0;
        int e =0;

        for(int i=0;i<s.length();i++){
           int n1 = func(s,i,i);
           int n2 = func(s,i,i+1);
           int len = Math.max(n1,n2);

           if(len>e-start){
            start=i-(len-1)/2;
            e= i+len/2;
           }
        }
        return s.substring(start,e+1);
    }
    public int func(String s, int l, int r){
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
            l--;
            r++;
        }
        return r-l-1;
    }
}