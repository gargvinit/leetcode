class Solution {
    public int countSquares(int[][] matrix) {
        int[][] dp = new int[matrix.length][matrix[0].length];   
        int result = 0;
        for(int i=0; i< matrix.length;i++){
            for(int j=0; j < matrix[i].length;j++){
                dp[i][j]= matrix[i][j]==1? 1:0;
                if(i > 0 && j>0 && matrix[i][j]==1){
                    dp[i][j] += Math.min(Math.min(dp[i][j-1],dp[i-1][j]),dp[i-1][j-1]);
                }
                result+= dp[i][j];                
            }
        }
        return result;
        
    }
    
}
