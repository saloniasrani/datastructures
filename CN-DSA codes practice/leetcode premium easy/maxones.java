public class maxones {
    public static int maxnomofones(int num[]) {
        int count=0;
        int countmax=0;
        for(int nums:num){
            if(nums==1){
                count++;
                if(count>countmax) countmax=count;

            }
               
            else
             count=0;


        }
        return countmax;
        
    }
    public static void main(String[] args) {
       System.out.println( maxnomofones( new int[]{1,1,1,1,1,0,0,0,0,0,1,1,1}));
    }
    
}
