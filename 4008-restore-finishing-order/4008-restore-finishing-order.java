class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        HashSet<Integer> map = new HashSet<>();
        int arr[] = new int[friends.length];

        for(int i=0; i<friends.length; i++){
            map.add(friends[i]);
        }
        int j = 0;
        for(int i=0; i<order.length; i++){
            if(map.contains(order[i])){
                arr[j] = order[i];
                j++;
            }
        }
        return arr;
    }
}