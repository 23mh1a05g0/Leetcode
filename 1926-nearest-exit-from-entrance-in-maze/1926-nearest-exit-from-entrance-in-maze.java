import java.util.*;

class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {

        int rows = maze.length;
        int cols = maze[0].length;
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{entrance[0], entrance[1], 0});
        maze[entrance[0]][entrance[1]] = '+';

        while (!queue.isEmpty()) {

            int[] current = queue.poll();
            int row = current[0];
            int col = current[1];
            int distance = current[2];
            for (int i = 0; i < 4; i++) {

                int newRow = row + dr[i];
                int newCol = col + dc[i];
                if (newRow >= 0 && newRow < rows &&
                    newCol >= 0 && newCol < cols &&
                    maze[newRow][newCol] == '.') {

                    if (newRow == 0 ||
                        newRow == rows - 1 ||
                        newCol == 0 ||
                        newCol == cols - 1) {

                        return distance + 1;
                    }
                    maze[newRow][newCol] = '+';
                    queue.offer(new int[]{
                        newRow,
                        newCol,
                        distance + 1
                    });
                }
            }
        }
        return -1;
    }
}