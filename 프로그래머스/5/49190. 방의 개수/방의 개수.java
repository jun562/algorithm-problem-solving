import java.util.*;

class Solution {
    private static final int[] dx = {0, 1, 1, 1, 0, -1, -1, -1};
    private static final int[] dy = {-1, -1, 0, 1, 1, 1, 0, -1};

    public int solution(int[] arrows) {
        int answer = 0;

        Set<String> visitedNodes = new HashSet<>();
        Set<String> visitedEdges = new HashSet<>();

        int cx = 0, cy = 0;
        visitedNodes.add(cx + "," + cy); // 시작 정점 저장 ("0,0")

        for (int arrow : arrows) {
            // 2배 스케일링 (1회 이동을 2회로 분할)
            for (int i = 0; i < 2; i++) {
                int nx = cx + dx[arrow];
                int ny = cy + dy[arrow];

                String currKey = cx + "," + cy;
                String nextKey = nx + "," + ny;

                String edgeKey1 = currKey + "->" + nextKey;
                String edgeKey2 = nextKey + "->" + currKey;

                if (visitedNodes.contains(nextKey)) {
                    if (!visitedEdges.contains(edgeKey1)) {
                        answer++;
                    }
                } else {
                    visitedNodes.add(nextKey);
                }

                visitedEdges.add(edgeKey1);
                visitedEdges.add(edgeKey2);

                cx = nx;
                cy = ny;
            }
        }

        return answer;
    }
}