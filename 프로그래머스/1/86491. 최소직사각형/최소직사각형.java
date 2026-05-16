class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int maxW = 0;
        int maxH = 0;
        for(int i = 0; i<sizes.length; i++){
            int l = 0;
            int s = 0;
            l = Math.max(sizes[i][0],sizes[i][1]);
            s = Math.min(sizes[i][0], sizes[i][1]);
            maxW = Math.max(maxW,l);
            maxH = Math.max(maxH,s);
        }
        answer = maxW * maxH;
        return answer;
    }
}