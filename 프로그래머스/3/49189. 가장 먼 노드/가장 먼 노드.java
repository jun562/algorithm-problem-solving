import java.util.*;

class Solution {
    public int solution(int n, int[][] edge) {
        int[] dist = new int[n+1];
        
        for(int i = 0; i <= n; i++){
            dist[i] = 0;
        }
        
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i <= n; i++){
            list.add(new ArrayList<Integer>());
        }
        for(int i = 0; i < edge.length; i++){
            list.get(edge[i][0]).add(edge[i][1]);
            list.get(edge[i][1]).add(edge[i][0]);
        }
        
        Queue<Integer> q = new ArrayDeque<>();
        q.offer(1);
        dist[1] = 1;
        
        while(!q.isEmpty()){
            int cur = q.poll();
            
            for(int neighbor : list.get(cur)){
                if(dist[neighbor] == 0){
                    q.offer(neighbor);
                    dist[neighbor] = dist[cur] + 1;
                }
            }
        }
        
        Arrays.sort(dist);
        int max = dist[n];
        int answer = 0;
        
        for(int i : dist){
            if(i == max){
                answer++;
            }
        }
        
        return answer;
    }
}

//1번 노드에서 가장 멀리 떨어진 노드 갯수
//노드 개수 : n , 간선 정보 : edge
//간선 양방향