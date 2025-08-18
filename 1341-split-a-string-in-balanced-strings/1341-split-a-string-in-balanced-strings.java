class Solution {
    public int balancedStringSplit(String s) {
        int s1 = 0;
        int s2 =0;
        for(char ch : s.toCharArray()){
         if(ch=='L')s1++;
         else s1--;
         if(s1==0)s2++;
        }
        return s2;
    }
}