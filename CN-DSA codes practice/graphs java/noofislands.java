import java.util.LinkedList;
import java.util.Queue;
//bfsapproach

class Solution {
    public int numIslands(char[][] grid) {
        int rows=grid.length;
        int columns=grid[0].length;
        int count=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(grid[i][j]=='1')
                    count+=traverseGrid(grid,rows,columns,i,j);
                
            }
        }
        return count;
    }
    
    public int traverseGrid(char[][] grid,int rows,int columns,int sr,int sc){
        int[] dx={0,1,-1,0};
        int[] dy={1,0,0,-1};
        Queue<int[]> queue= new LinkedList<>();
        queue.add(new int[]{sr,sc});
        
        //BFS approach
        while(!queue.isEmpty()){
            int[] current=queue.poll();
            for(int i=0;i<4;i++){
                int x = current[0] + dx[i]; 
                int y = current[1] + dy[i]; 
                
                if(x<rows&&y<columns&& x>=0 && y>=0){
                    if (grid[x][y] == '1'){
                        queue.add(new int[]{x, y}); 
                        grid[x][y] = '2';
                    }
                }
                
            }
        }
        
        grid[sr][sc] = '2';
        return 1; 
    }
    
}




//dfs approach
class Solution {
    public int numIslands(char[][] grid) {
        int rows=grid.length;
        int columns=grid[0].length;
        int count=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(grid[i][j]=='1')
                    count+=helper2(i,j,grid);
                
            }
        }
        return count;
    }
    
    public static int helper2(int i, int j, char[][] grid){
        if(i<0 || j <0 || i>grid.length-1 || j>grid[0].length-1){
            return 0 ;
        }

        if(grid[i][j] == '0'){
            return 0;
        }

        grid[i][j] = '0';

        helper2(i-1, j, grid);
        helper2(i, j-1, grid);
        helper2(i+1, j, grid);
        helper2(i, j+1, grid);

        return 1 ;
    }
    
}