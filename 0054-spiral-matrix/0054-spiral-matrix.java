class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> res = new ArrayList<>();
        int row = matrix.length;
        int col = matrix[0].length;
        int top = 0, bottom = row-1, left = 0, right = col-1;
        while(top <= bottom && left <= right){
            if(top <= bottom && left <= right){
                for(int i = left;i<=right;i++){
                    res.add(matrix[top][i]);
                }
                top++;
            }
            if(top <= bottom && left <= right){
                for(int i=top;i<=bottom;i++){
                    res.add(matrix[i][right]);
                }
                right--;
            }
            if(top <= bottom && left <= right){
                for(int i=right;i>=left;i--){
                    res.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(top <= bottom && left <= right){
                for(int i=bottom;i>=top;i--){
                    res.add(matrix[i][left]);
                }
                left++;
            }
            
        }
        return res;

    }
}