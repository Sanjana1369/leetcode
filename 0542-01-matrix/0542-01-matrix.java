class Solution {
    public int[][] updateMatrix(int[][] mat) {
        Queue<int[]> queue = new LinkedList<>();
        int rows = mat.length;
        int cols = mat[0].length;
        int[][] dist = new int[rows][cols];
        for(int i = 0; i < dist.length; i++){
            Arrays.fill(dist[i], -1);
                }
                for(int i = 0; i < rows;i++){
                    for(int j = 0; j < cols; j++){
                        if(mat[i][j] == 0){
                            queue.offer(new int[]{i,j});
                            dist[i][j] =0;
                        }
                    }
                }
                int[][] directions = {
                    {-1,0}, {1,0}, {0, -1}, {0, 1}
                    };
                while(!queue.isEmpty()){
                    int[] current = queue.poll();
                    int row = current[0];
                    int col = current[1];
                    for(int[] dir : directions){
                        int newRow = row + dir[0];
                        int newCol = col + dir[1];

                        if(newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols && dist[newRow][newCol] == -1){
                            dist[newRow][newCol] = dist[row][col] + 1;
                            queue.offer(new int[] {newRow, newCol});
                        }

                    }
                }
                return dist;
    }
}