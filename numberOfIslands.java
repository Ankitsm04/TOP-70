// # 8 LeetCode 200
// 8 Number of Islands

//Aproach 1
//TC: O(m*n) & SC: O(m*n)
//DFS
class Solution {
    public int numIslands(char[][] grid) {
       if(grid == null || grid.length == 0) return 0;
       int count = 0;
       int m = grid.length;
       int n = grid[0].length;
       for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(grid[i][j] == '1'){
                dfs(grid,i,j);
                count++;
            }
        }
       } 
       return count;
    }
    public void dfs(char[][] grid, int i, int j){
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j] == '0')
            return;
        grid[i][j] = '0';
        dfs(grid,i+1,j);
        dfs(grid,i-1,j);
        dfs(grid,i,j+1);
        dfs(grid,i,j-1);
    }
}

//Aproach 2
//TC: O(m*n) & SC: O(m*n)
//BFS
class Solution {
    public int numIslands(char[][] grid) {
       if(grid == null || grid.length == 0) return 0;
       int count = 0;
       int m = grid.length;
       int n = grid[0].length;
       for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(grid[i][j] == '1'){
                bfs(grid,i,j);
                count++;
            }
        }
       } 
       return count;
    }
    public void bfs(char[][] grid, int i, int j){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{i,j});
        while(!q.isEmpty()){
            int[] cur = q.poll();
            int x = cur[0];
            int y = cur[1];
            if(x<0 || x>=grid.length || y<0 || y>=grid[0].length || grid[x][y] == '0')
                continue;
            grid[x][y] = '0';
            q.add(new int[]{x+1,y});
            q.add(new int[]{x-1,y});
            q.add(new int[]{x,y+1});
            q.add(new int[]{x,y-1});
        }
    }
}