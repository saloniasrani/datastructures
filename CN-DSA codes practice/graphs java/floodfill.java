class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        // sr, sc: Starting Point 
        if(image[sr][sc] == newColor) {
            return image;     
        }
        
        int si= image[sr][sc];
             
        int[] dx= { 0, 1, -1, 0 };
        int[] dy= { 1, 0, 0, -1 };
        
        Queue<int[]> queue = new LinkedList<>();  
        queue.add(new int[]{sr, sc}); 
        image[sr][sc] = newColor; 
        
        while(!queue.isEmpty()){
            int[] current = queue.poll(); 
            
            for(int i=0; i< 4; i++){
                int x = current[0] + dx[i]; 
                int y = current[1] + dy[i]; 

                if(x< image.length && y< image[0].length && x>=0 && y>=0 ){
                    if(image[x][y] == si){
                        image[x][y] = newColor; 
                        queue.add(new int[]{x, y}); 
                    }
                }
            }
        }
        
        return image; 
        
    }
}