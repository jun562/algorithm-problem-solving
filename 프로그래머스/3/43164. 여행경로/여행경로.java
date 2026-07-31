import java.util.*;

class Solution {
    
    static boolean[] visited;
    static List<String> allRoutes;
    static String[][] ticket;
    
    public String[] solution(String[][] tickets) {
        visited = new boolean[tickets.length];
        allRoutes = new ArrayList<>();
        ticket = tickets;
        
        dfs("ICN","ICN",0);
        Collections.sort(allRoutes);
        
        return allRoutes.get(0).split(" ");
    }
    
    public static void dfs(String current, String route,int count){
        if(count == ticket.length){
            allRoutes.add(route);
            return;
        }
        
        for(int i = 0; i < ticket.length; i++){
            if(!visited[i] && ticket[i][0].equals(current)){
                visited[i] = true;
                dfs(ticket[i][1], route + " " + ticket[i][1], count + 1);
                visited[i] = false;
            }
        }
    }
}


// icn -> 
// 가능한 경로 2개 이상 -> b 공항 사전순
// 주어진 공항 수 3 ~ 10000 : 최대 10000 * 10001 / 2 번 탐색 = 5천만 (dfs로 처리 가능)
// 1. 주어진 티켓들중 a공항 ICN 찾기
// 1-1. ICN 티켓들을 b공항 기준으로 오름차순 정렬 및 선택(usage == true)
// 2. 직전 b공항이 start인 티켓 찾기
// 2-1. 티켓들을 b공항 기준으로 오름차순 정렬 및 선택
// 반복