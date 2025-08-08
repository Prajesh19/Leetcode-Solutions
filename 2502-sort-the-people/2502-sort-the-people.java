class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
     HashMap<Integer,String> map=new HashMap<>();
     for(int i=0;i<names.length;i++)
     {
        map.put(heights[i],names[i]);
     }   
     Arrays.sort(heights);
     String[] sorted=new String[names.length];
     int count=0;
     for(int i=heights.length-1;i>=0;i--)
        {
            sorted[count++]=map.get(heights[i]);
        }
        return sorted;
     
    }
}