/*Approach 1
 * O(n):Time Complexity
 * O(1): Space
 */

public class maxsubarray {
    class Solution {
        public int maxSubArray(int[] nums) {
            int max=Integer.MIN_VALUE;
            int cur=0;
            for(int x:nums){
                if(cur<0)cur=0;
                cur+=x;
                max=Math.max(max,cur);
            }
            return max;
        }
    }
}
