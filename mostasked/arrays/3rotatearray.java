// simple approach using extra memory

class Solution {
    public void rotate(int[] nums, int k) {
        int[] temps= new int[nums.length];
        for(int i=0;i<nums.length;i++){
            temps[(i+k)%nums.length]=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=temps[i];
        }
    }
}

// second aproach with no extra memory
class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
       reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }
     public static void reverse(int[] nums, int l, int r){
           
        int temp;
        while(l<=r){
            temp=nums[r];
            nums[r]=nums[l];
            nums[l]=temp;
            r--;
            l++;
            
        }
        }
    
}