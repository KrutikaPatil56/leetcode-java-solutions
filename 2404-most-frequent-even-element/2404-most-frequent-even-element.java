class Solution {
    public int mostFrequentEven(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency of even numbers
        for (int num : nums) {
            if (num % 2 == 0) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        int answer = -1;
        int maxFreq = 0;

        // Find most frequent even number
        for (int num : map.keySet()) {

            int freq = map.get(num);

            if (freq > maxFreq) {
                maxFreq = freq;
                answer = num;
            }
            else if (freq == maxFreq && num < answer) {
                answer = num;
            }
        }

        return answer;
    }
}