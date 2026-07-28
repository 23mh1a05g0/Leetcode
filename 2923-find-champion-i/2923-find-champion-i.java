class Solution {
    public int findChampion(int[][] grid) {
        int n = grid.length;
        int max = 0;
        int index = -1;
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=0;j<n;j++){
                sum = sum + grid[i][j];
            }
           if(sum > max) {
                max = sum;
                index = i;
            }
        }
        return index;
    }
}