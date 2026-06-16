import java.util.*;

class Edge {
    int from, to, cost;
    Edge(int from, int to, int cost){
        this.from = from;
        this.to = to;
        this.cost = cost;
    }
}

class Solution {
    public int solution(int n, int[][] costs) {
        
        List<List<Edge>> adj = new ArrayList<>();
        for(int i = 0; i <= n; i++){
            adj.add(new ArrayList<>());
        }
        
        for(int i = 0; i < costs.length; i++){
            int from = costs[i][0];
            int to = costs[i][1];
            int cost = costs[i][2];
            
            adj.get(from).add(new Edge(from, to, cost));
            adj.get(to).add(new Edge(to, from, cost));
        }
        
        boolean[] chk = new boolean[n+1];
        PriorityQueue<Edge> pq = new PriorityQueue<>((a,b) -> a.cost - b.cost);
        
        chk[1] = true;
        for (Edge edge : adj.get(1)){
            pq.add(edge);
        }
        
        int cnt = 0;
        int total = 0;
        
        while(!pq.isEmpty()){
            Edge cur = pq.poll();
            
            if(chk[cur.to]) continue;
            
            chk[cur.to] = true;
            total += cur.cost;
            cnt ++;
            
            if(cnt == n - 1) break;
            
            for (Edge next : adj.get(cur.to)){
                if(!chk[next.to]){
                    pq.add(next);
                }
            }
        }
        return total;
    }
}