import java.util.*;

class Solution {
    public int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {
        int[][] map = new int[102][102];
        
        for(int[] r : rectangle){
            int x1 = r[0] * 2;
            int y1 = r[1] * 2;
            int x2 = r[2] * 2;
            int y2 = r[3] * 2;
            
            for(int i = x1; i <= x2; i++){
                for(int j = y1; j <= y2; j++){
                    if(map[i][j] == 2){
                        continue;
                    }
                    
                    if(i == x1 || i == x2 || j == y1 || j == y2){
                        map[i][j] = 1;
                    } else {
                        map[i][j] = 2;
                    }
                }
            }
        }
            
        int[][] dist = new int[102][102];
        
        for(int i = 0; i < 102; i++){
            Arrays.fill(dist[i],-1);
        }
        
        dist[characterX *2][characterY * 2] = 0;
        
        Queue<int[]> q = new ArrayDeque<>();
        q.offer(new int[]{characterX * 2, characterY * 2});
        
        int[] dx = {-1,1,0,0};
        int[] dy = {0,0,-1,1};
        
        while(!q.isEmpty()){
            int[] cur = q.poll();
            int cx = cur[0];
            int cy = cur[1];
            
            if(cx == itemX * 2 && cy == itemY * 2){
                return dist[cx][cy] / 2;
            }
            
            for(int i = 0; i<4; i++){
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                
                if(nx < 0 || nx >100 || ny < 0 || ny > 100){
                    continue;
                }
                
                if(dist[nx][ny] != -1 || map[nx][ny] != 1){
                    continue;
                }
                
                q.offer(new int[]{nx, ny});
                dist[nx][ny] = dist[cx][cy] + 1;
                
            }
        }
        return 0;
    }
}

//백준의 색종이 문제?
//캐릭터 -> 다각형 둘레 이동
//중앙 빈공간 -> 이동 x (가장 바깥쪽 테두리 이동 필수)
//직사각형 중복 x
//두개이상으로 분리 x
//가장 짧은 거리