class Solution {
    public int orangesRotting(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;

        Queue<int[]> queue = new LinkedList<>();

        int fresh = 0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j] == 1){
                    fresh++;
                }
                else if(grid[i][j] == 2){
                    queue.offer(new int[]{i,j});
                }
            }
        }
        if(fresh == 0){
            return 0;
        }
        
        int dr[] = {-1,1,0,0};
        int dc[] = {0,0,-1,1};
        
        int minutes = 0;

        while(!queue.isEmpty()){
            int size = queue.size();

            for(int i=0;i<size;i++){
                int[] current = queue.poll();
                int Row = current[0];
                int Col = current[1];

                for(int d=0;d<4;d++){
                    int newRow = Row + dr[d];
                    int newCol = Col + dc[d];

                    if(newRow >=0 && newRow < row &&
                       newCol >=0 && newCol < col &&
                       grid[newRow][newCol] == 1){
                        grid[newRow][newCol] = 2;
                        fresh--;

                        queue.offer(new int[]{newRow,newCol});
                       }
                }
            }

            if(!queue.isEmpty()){
                minutes++;
            }
        }
        if(fresh == 0){
            return minutes;
        }
        return -1;
    }
}