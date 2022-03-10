import java.util.*;

class Program {

  public int[] sortKSortedArray(int[] array, int k) {
    // Write your code here.
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		int i=0;
		for(;i<Math.min(k,array.length);i++){
			pq.add(array[i]);
			
		}
		for(;i<array.length;i++){
			array[i-k]=pq.remove();
			pq.add(array[i]);
		}
		for(int j=array.length-k;j<array.length;j++){
			array[j]=pq.remove();
		}
		return array;
    
  }
  
	
}
