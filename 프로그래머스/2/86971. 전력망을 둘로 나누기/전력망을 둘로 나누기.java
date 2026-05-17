import java.util.*;

class Solution {
    
    static List<List<Integer>> graph = new ArrayList<>();
    static boolean[] visited;

    public int solution(int n, int[][] wires) {
        int answer = Integer.MAX_VALUE;

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] wire : wires) {
            int v1 = wire[0];
            int v2 = wire[1];
            graph.get(v1).add(v2);
            graph.get(v2).add(v1);
        }


        for (int[] wire : wires) {
            int cutV1 = wire[0];
            int cutV2 = wire[1];

            visited = new boolean[n + 1];

            int countA = dfs(cutV1, cutV1, cutV2);
            
            int countB = n - countA;

            int difference = Math.abs(countA - countB); //절댓값
            answer = Math.min(answer, difference);
        }

        return answer;
    }

    public static int dfs(int current, int v1, int v2) {
        visited[current] = true; 
        int count = 1;

        // 현재 송전탑과 연결된 이웃 송전탑들을 하나씩 검사합니다.
        for (int next : graph.get(current)) {
            if (visited[next]) {
                continue;
            }
            
            if ((current == v1 && next == v2) || (current == v2 && next == v1)) {
                continue;
            }

            count += dfs(next, v1, v2);
        }

        return count;
    }
}