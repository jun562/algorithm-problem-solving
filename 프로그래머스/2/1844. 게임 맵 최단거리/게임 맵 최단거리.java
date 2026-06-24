import java.util.*;

class Solution {
    static int N, M;
    static int[][] map;
    static int[][] dist;
    
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    
    public int solution(int[][] maps) {
        N = maps.length;
        M = maps[0].length;
        
        map = maps;
        dist = new int[N][M];
        
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                dist[i][j] = -1;
            }
        }
        
        bfs(0, 0);
        
        return dist[N-1][M-1]; 
    }
    
    public static void bfs(int startX, int startY){
        Queue<int[]> queue = new ArrayDeque<>(); 
        
        queue.offer(new int[] {startX, startY});
        dist[startX][startY] = 1; 
        
        while(!queue.isEmpty()){
            int[] current = queue.poll();
            int currentX = current[0];
            int currentY = current[1];
            
            for(int i = 0; i < 4; i++){
                int nextX = currentX + dx[i];
                int nextY = currentY + dy[i];
                
                if (nextX < 0 || nextY < 0 || nextX >= N || nextY >= M){
                    continue;
                }
                
                if (dist[nextX][nextY] != -1 || map[nextX][nextY] == 0){
                    continue;
                }
                
                queue.offer(new int[] {nextX, nextY});
                dist[nextX][nextY] = dist[currentX][currentY] + 1;
            }
        }
    }
}