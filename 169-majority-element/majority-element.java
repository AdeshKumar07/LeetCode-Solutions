class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> m1=new HashMap<>();
       int n=nums.length;
        for(int i=0;i<n;i++){
            int num=nums[i];
            if(m1.containsKey(num)){
            m1.put(num,m1.get(num)+1);
        }
        else{
            m1.put(num,1);
        }
        if(m1.get(num)>n/2){
            return num;
        }

        }

       return -1;

    }
}