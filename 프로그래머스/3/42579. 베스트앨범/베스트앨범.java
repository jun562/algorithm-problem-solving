import java.util.*;
class Music {
    String genre;
    int play;
    int num;
    
    Music(String genre, int play, int num){
        this.genre = genre;
        this.play = play;
        this.num = num;
    }
}

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        List<Music> musics = new ArrayList<>();
        Map<String,Integer> sum = new HashMap<>();
        
        for(int i = 0; i < genres.length; i++){
            musics.add(new Music(genres[i],plays[i],i));
            sum.put(genres[i],sum.getOrDefault(genres[i],0)+plays[i]);
        }
        
        List<String> sorted = new ArrayList<>(sum.keySet());
        Collections.sort(sorted,(a,b) -> {
            return sum.get(b) - sum.get(a);
        });
        
        List<Integer> result = new ArrayList<>();
        
        for(String genre : sorted){
            List<Music> genreList = new ArrayList<>();
            for(Music music : musics){
                if(music.genre.equals(genre)){
                    genreList.add(music);
                }
            }
            Collections.sort(genreList, (a,b) -> {
                if(a.play != b.play){
                    return b.play - a.play;
                }
                return a.num - b.num;
            });
            
            if(genreList.size() == 1){
                result.add(genreList.get(0).num);
            } else {
                result.add(genreList.get(0).num);
                result.add(genreList.get(1).num);
            }
            
        }
        
        int[] answer = new int[result.size()];
        
        for (int i = 0; i < result.size(); i ++){
            answer[i] = result.get(i);
        }
        
        return answer;
    }
}
// 전체에서 가장 많이 재생된 장르 먼저 수록
// 장르에서 가장 많이 재생된 노래 먼저 수록
// 장르 내에서 재생 횟수 같으면 고유 번호 낮은 순