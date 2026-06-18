import java.util.*;

class Solution {
    static int[] p;
    
    public static int find(int x){
        if(p[x] == x) return x;
        return p[x] = find(p[x]);
    }
    
    public static boolean union(int u, int v){
        u = find(u);
        v = find(v);
        
        if (u == v){
            return false;
        }
        
        p[v] = u;
        return true;
    }
    
    public int solution(int n, int[][] computers) {
        p = new int[n]; //0 ~ n-1
        
        for(int i = 0; i < n; i++){
            p[i] = i;
        }
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i!=j && computers[i][j] ==1){
                    union(i,j);
                }
            }
        }
        
        int answer = 0;
        for(int i = 0; i< n; i++){
            if(p[i] == i){
                answer++;
            }
        }
        
        return answer;
    }
}

//그래프
//컴퓨터 개수 n, 연결 정보 computers -> 네트워크 개수
//computers[i][j] -> i와j 연결시 1, 아니면 0
//computers[i][i] -> 항상 1
// 