import java.util.*;

class Truck {
    int weight;
    int distance;
    Truck(int weight, int distance){
        this.weight = weight;
        this.distance = distance;
    }
}
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Truck> waitings = new ArrayDeque<>();
        Queue<Truck> bridge = new ArrayDeque<>();
        
        for (int w : truck_weights){
            waitings.offer(new Truck(w,0));
        }
        
        int currentWeight = 0;
        
        while(!waitings.isEmpty() || !bridge.isEmpty()){
            answer ++;
            
             for(Truck truck : bridge){
                truck.distance ++;
            }
            
            if(!bridge.isEmpty() && bridge.peek().distance == bridge_length){
                Truck arrived = bridge.poll();
                currentWeight -= arrived.weight;
            }
            
            if(!waitings.isEmpty() && ((waitings.peek().weight + currentWeight) <= weight)){
                Truck start = waitings.poll();
                bridge.offer(new Truck(start.weight,0));
                currentWeight += start.weight;
            }
           
        }
        
        return answer;
    }
}
// 큐 대기
// 큐 넣기
// 
// 최대 개수 , weight 이하(완전히 오르지 않은 트럭 무게 무시), 
// return 최소 몇 초