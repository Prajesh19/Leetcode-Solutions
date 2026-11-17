class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> list = new ArrayList<>();
        int num = 1;
        for(int i : target){
            while(num < i){
                list.add("Push");
                list.add("Pop");
                  num++;
            }
            list.add("Push");
             num++;
        }
        return list;
    }
}