import java.util.Arrays;

public class Solution {
    public int solution(int[] citations) {
        // 배열 정렬
        Arrays.sort(citations);

        // h-index 계산
        int hIndex = 0;
        int n = citations.length;
        for (int i = 0; i < n; i++) {
            int h = n - i; // 남은 논문의 개수
            if (citations[i] >= h) {
                hIndex = h;
                break;
            }
        }

        // h-index 반환
        return hIndex;
    }
}