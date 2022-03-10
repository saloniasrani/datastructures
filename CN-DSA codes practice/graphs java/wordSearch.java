class Solution {
    public boolean exist(char[][] board, String word) {
        if( board.length==0)return false;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
               if( board[i][j] == word.charAt(0) && dfs(board,word,i,j,0))
                   return true;
            }
        }
        return false;
    }
        
       public static boolean dfs(char[][] board, String word, int i,int j, int index){
           if(index == word.length())
               return true;
           if(i<0 || j<0 || i>=board.length || j>=board[0].length || board[i][j]==' ' || board[i][j] != word.charAt(index) )
               return false;
           char current=board[i][j];
           board[i][j] = ' ';
           if(dfs(board,word,i+1,j,index+1)||
              dfs(board,word,i-1,j,index+1)||
              dfs(board,word,i,j+1,index+1)||
              dfs(board,word,i,j-1,index+1))
               return true;
           board[i][j] = current;
           return false;
           
       }
    
}