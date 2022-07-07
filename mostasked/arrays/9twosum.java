// approach 1
// O(n): time
// O(n): space

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map= new HashMap<>();
        int diff=0;
        for(int i=0;i<nums.length;i++){
            diff=target-nums[i];
            if(!map.containsKey(diff))
                map.put(nums[i],i);
            else
                return new int[] {i,map.get(diff)};
        }
        throw new IllegalArgumentException("no match found");
    }
}
// approach 2
// brute force: two for loops
// time: O(n^2)
// space: O(1)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        // In case there is no solution, we'll just return null
        return null;
    }
}