class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<stones.length;i++){
            pq.add(stones[i]);
        }
        while(pq.size() > 1){
            int stone1 = pq.poll();
            int stone2 = pq.poll();
            if(stone1 > stone2){
                pq.add(stone1-stone2);
            }
        }
        if(pq.isEmpty()){
            return 0;
        }
        return pq.poll();
        
    }
}
