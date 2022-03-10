import java.util.PriorityQueue;

// package heaps java;

public class Kthlargest {
    public int findkthlargest(int[] nums,int k ){
        PriorityQueue<Integer> pq= new PriorityQueue<>(k);
        for(int i=0;i<k;i++){
            pq.add(nums[i]);
        }
        for(int j=k;j<nums.length;j++){
            if(pq.size()==k){
            if(nums[j]>pq.peek())
            {
                pq.remove();
                pq.add(nums[j]);
            }
            else
            continue;
        }
    }


        return pq.peek();
    }
}
