class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int len = grid.length;
        if(grid[0][0] == 1 || grid[len-1][len-1] == 1){
            return -1;
        }

        int dr[] = {-1,-1,-1,0,0,1,1,1};
        int dc[] = {-1,0,1,-1,1,-1,0,1};

        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visisted = new boolean[len][len];
        queue.offer(new int[]{0,0,1});
        visisted[0][0] = true;

        while(!queue.isEmpty()){
            int[] current = queue.poll();
            int row = current[0];
            int col = current[1];
            int distance = current[2];
            if(row == len-1 && col == len-1){
                return distance;
            }

            for(int i=0;i<8;i++){
                int newRow = row + dr[i];
                int newCol = col + dc[i];

                if(newRow >= 0 && newRow < len &&
                   newCol >= 0 && newCol < len &&
                   grid[newRow][newCol] == 0 &&
                   !visisted[newRow][newCol]){
                    visisted[newRow][newCol] = true;

                    queue.offer(new int[]{
                        newRow,
                        newCol,
                        distance + 1,
                    });
                   }
            }
        }
        return -1;

    }
}