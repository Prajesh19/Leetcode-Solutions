class Solution {
    public int numberOfBeams(String[] bank) {
        int total = 0;
        int prev=0;
        for(String r : bank){
            int current =0;
            for(int i=0;i<r.length();i++){
                if(r.charAt(i)=='1'){
                    current++;
                }
            }
            if(current>0){
              total = total + prev * current;
              prev = current;
            }
        }
        return total;
    }
}