class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //created HashMap to store nums[i] a/c to there frequency 
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        //Now I need to sort a/c to there frequency 
        // created min Priority Queue and Sorted in assending order 
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->map.get(a)-map.get(b));
        for(int num:map.keySet()){
            pq.add(num);
            if(pq.size()>k){
                pq.poll();
            }
        }
        int[] res=new int[k];
        for(int i=0;i<k;i++){
            res[i]=pq.poll();
        }
        return res;


    
    }
}