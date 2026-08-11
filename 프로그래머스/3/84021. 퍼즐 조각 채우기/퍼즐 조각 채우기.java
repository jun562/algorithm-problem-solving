import java.util.*;

class Point{
        int x;
        int y;
        Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

class Solution {
    static boolean[][] visited;
    static int[] dx = {0,0,1,-1};
    static int[] dy = {1,-1,0,0};
    static int N;
    
    public int solution(int[][] game_board, int[][] table) {
        N = game_board.length;
        visited = new boolean[N][N];
        List<List<Point>> puzzles = new ArrayList<>();
        
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(table[i][j]==1 && !visited[i][j]){
                    List<Point> puzzle = bfs(i,j,table,1);
                    puzzles.add(rebase(puzzle));
                }
            }
        }
        
        visited = new boolean[N][N];
        List<List<Point>> spaces = new ArrayList<>();
        
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(game_board[i][j] == 0 && !visited[i][j]){
                    List<Point> space = bfs(i,j,game_board,0);
                    spaces.add(rebase(space));
                }
            }
        }
        int answer = 0;
        
        for(List<Point> space : spaces){
            for(int j = 0; j < puzzles.size(); j++){
                List<Point> puzzle = puzzles.get(j);
                
                if(space.size() != puzzle.size()){
                    continue;
                }
                
                List<Point> cur = puzzle;
                boolean isMatch = false;
                
                for(int r = 0; r < 4; r++){
                    if(compare(space,cur)){
                        answer += space.size();
                        puzzles.remove(j);
                        isMatch = true;
                        break;
                    }
                    cur = rotate(cur);
                }
                
                if(isMatch){
                    break;
                }
            }
        }
        
        return answer;
    }
    
    public static List<Point> bfs(int i, int j, int[][] table, int target){
        List<Point> p = new ArrayList<>();
        Queue<Point> q = new ArrayDeque<>();
        
        visited[i][j] = true;
        q.offer(new Point(i,j));
        p.add(new Point(i,j));
        
        while(!q.isEmpty()){
            Point cur = q.poll();
            int cx = cur.x;
            int cy = cur.y;
            
            for(int k = 0; k < 4; k++){
                int nx = cur.x + dx[k];
                int ny = cur.y + dy[k];
                
                if(nx < 0 || ny < 0 || nx >= N || ny >=N){
                    continue;
                }
                if(visited[nx][ny] || table[nx][ny] != target){
                    continue;
                }
                
                visited[nx][ny] = true;
                q.offer(new Point(nx,ny));
                p.add(new Point(nx,ny));
            }
        }
        return p;
    }
    
    public static List<Point> rebase(List<Point> puzzle){
        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;
        
        for(Point p : puzzle){
            minX = Math.min(minX, p.x);
            minY = Math.min(minY, p.y);
        }
        
        List<Point> rebased = new ArrayList<>();
        for(Point p : puzzle){
            rebased.add(new Point(p.x - minX, p.y - minY));
        }
        
        Collections.sort(rebased, (a,b) -> {
            if(a.x == b.x){
                return a.y - b.y;
            }
            return a.x - b.x;
        });
        
        return rebased;
    }
    
    public static List<Point> rotate(List<Point> puzzle){
        List<Point> rotated = new ArrayList<>();
        for(Point p : puzzle){
            rotated.add(new Point(p.y,-p.x));
        }
        return rebase(rotated);
    }
    
    public static boolean compare(List<Point> p1, List<Point> p2){
        for(int i = 0; i < p1.size(); i++){
            if(p1.get(i).x != p2.get(i).x || p1.get(i).y != p2.get(i).y){
                return false;
            }
        }
        return true;
    }
} 