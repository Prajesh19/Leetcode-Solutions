class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int time = 0;
        int target = tickets[k];

        for (int i = 0; i < tickets.length; i++) {
            if (i <= k) {
                // People at or ahead of k buy at most 'target' tickets
                time += Math.min(tickets[i], target);
            } else {
                // People behind k miss the final pass once k finishes, so at most 'target - 1'
                time += Math.min(tickets[i], target - 1);
            }
        }

        return time;
    }
}