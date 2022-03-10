

import java.util.ArrayList;
import java.util.HashMap;

public class RemoveDuplicates {

    public static ArrayList<Integer> removeDuplicates(int a[]) {
        ArrayList<Integer> output=new ArrayList<>();
        HashMap<Integer,Boolean> seen = new HashMap<>();
        for(int i=0;i<a.length;i++){
            if(seen.containsKey(a[i])){
                continue;
            }
            output.add(a[i]);
            seen.put(a[i],true);
        }
        System.out.println(seen.size());
       return output;
    
      
        
    }

public static void main(String[] args) {
    int a[]={1,1,2,2,3,41,6,1000,3,7};
    ArrayList<Integer> output=removeDuplicates(a);
    for(int i=0;i<output.size();i++){
        System.out.print(output.get(i) + " ");
    }
    
    
}
}