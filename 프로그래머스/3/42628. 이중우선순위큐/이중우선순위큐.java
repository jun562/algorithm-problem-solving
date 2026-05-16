import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        TreeMap<Integer,Integer> map = new TreeMap<>();
        
        for(int i = 0; i < operations.length; i++){
            String operation = operations[i];
            
            if(operation.startsWith("I")){
                String[] s = operation.split(" ");
                int num = Integer.parseInt(s[1]);
                map.put(num,map.getOrDefault(num,0)+1);
            } 
            else if(operation.equals("D 1")){
                if(!map.isEmpty()){
                    map.put(map.lastKey(), map.get(map.lastKey()) - 1);
                    if(map.get(map.lastKey())==0){
                        map.remove(map.lastKey());
                    }
                }
                    
            } 
            else if(operation.equals("D -1")){
                if(!map.isEmpty()){
                    map.put(map.firstKey(), map.get(map.firstKey()) - 1);
                    if(map.get(map.firstKey())==0){
                        map.remove(map.firstKey());
                    }
                }
                
            }
        }
        
        if(map.size()==0){
            answer[0] = 0;
            answer[1] = 0;
        } else{
            answer[0] = map.lastKey();
            answer[1] = map.firstKey();
        }
        
        return answer;
    }
}