object Solution {
    def uniquePathsWithObstacles(obstacleGrid: Array[Array[Int]]): Int = {
        
        val m = obstacleGrid.length
        
        val n = obstacleGrid(0).length
        val arr = Array.ofDim[Int](m,n)
        for(i <- m-1 to 0 by -1){
            for(j <- n-1 to 0 by -1){
                if(obstacleGrid(i)(j) == 0){
                    if(i == m-1 && j == n-1) {
                        arr(i)(j) = 1       
                    }else {
                        arr(i)(j) = (if(i+1 < m && obstacleGrid(i+1)(j) == 0) arr(i+1)(j) else 0) + (if(j+1 < n && obstacleGrid(i)(j+1) == 0) arr(i)(j+1) else 0)

                    }
                }
            }
        }
        return if(obstacleGrid(0)(0) == 0) arr(0)(0) else 0
    }
}
