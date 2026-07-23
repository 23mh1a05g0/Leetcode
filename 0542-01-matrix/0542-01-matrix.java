class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int[][] dist = new int[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(mat[i][j] == 0){
                    queue.offer(new int[]{i,j});
                }else{
                    dist[i][j] = -1;
                }
            }
        }

        int[] dr = {-1,1,0,0};
        int[] dc = {0,0,-1,1};

        while(!queue.isEmpty()){
            int[] current = queue.poll();
            int r = current[0];
            int c = current[1];
            int distance = 0;

            for(int i=0;i<4;i++){
               int newRow = r + dr[i];
               int newCol = c + dc[i];

            if(newRow >= 0 && newRow < row &&
               newCol >= 0 && newCol < col &&
               dist[newRow][newCol] == -1){
                  dist[newRow][newCol] = dist[r][c] + 1;
                  queue.offer(new int[]{newRow,newCol});
               }
            }
        }
        return dist;
    }
}