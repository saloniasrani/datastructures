//time complexity: O(m+n)
//spcae:O(min(m,n))

//length of the shorter array is kept first and put into the hashmap so that the hashmap takes space as little as possible
// approach 1
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length > nums2.length){
            return intersect(nums2,nums1);
        }
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            map.put(nums1[i],map.getOrDefault(nums1[i],0)+1);
        }
        List<Integer> list= new ArrayList<>();
        for(int num : nums2){
            int count= map.getOrDefault(num,0);
            if(count>0){
                list.add(num);
                map.put(num,count-1);
            }
        }
        int[] result = new int[list.size()];
        int i=0;
        for(int num : list){
            result[i++]=num;
        }
        
        return result;
    }
}