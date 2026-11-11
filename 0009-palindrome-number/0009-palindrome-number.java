class Solution {
    public boolean isPalindrome(int x) {
        int ori = x;
        int rev=0;
        boolean b = false;
        while(ori>0){
            int dig = ori%10;
            rev= rev*10 + dig;
            ori/=10;
        }
        if(rev==x){
            b= true;
            return b;
        }else{
            return b;
        }
    }
}