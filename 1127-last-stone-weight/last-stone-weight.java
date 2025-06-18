class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());
        for(int st:stones) maxHeap.add(st);
        while(maxHeap.size()>1){
            int l=maxHeap.poll();
            int s_l=maxHeap.poll();
            if(l!=s_l){
                maxHeap.add(l-s_l);
            }
        }
        return maxHeap.isEmpty() ? 0 : maxHeap.poll();
    }
}