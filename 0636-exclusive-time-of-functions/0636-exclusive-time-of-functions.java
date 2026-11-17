class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {
        int[] res = new int[n];
        Deque<Integer> stack = new ArrayDeque<>();
        int prevTime = 0;

        for (String log : logs) {
            String[] parts = log.split(":");
            int id = Integer.parseInt(parts[0]);
            String type = parts[1];
            int time = Integer.parseInt(parts[2]);

            if (type.equals("start")) {
                // Pause the currently running function (if any) and add its elapsed time
                if (!stack.isEmpty()) {
                    res[stack.peek()] += time - prevTime;
                }
                stack.push(id);
                prevTime = time;
            } else {
                // "end" happens at the END of 'time', so add +1 unit and advance prevTime to time + 1
                res[stack.pop()] += time - prevTime + 1;
                prevTime = time + 1;
            }
        }

        return res;
    }
}