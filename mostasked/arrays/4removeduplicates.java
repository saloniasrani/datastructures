class Solution {
    public int removeDuplicates(int[] nums) {
        int right=1;
        int l=1;
        for(;right<nums.length;right++){
            if(nums[right]!=nums[right-1]){
                nums[l]=nums[right];
                l+=1;
            }
        }
        return l;
    }
}