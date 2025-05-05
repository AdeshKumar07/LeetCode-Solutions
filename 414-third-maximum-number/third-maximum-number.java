class Solution {
    public int thirdMax(int[] nums) {
       TreeSet<Integer> set=new TreeSet();
       for(int num:nums){
        set.add(num);
        if(set.size()>3){
            set.pollFirst();//use for remove all smallest leave 3 greater
        }
       }
       if(set.size()==3){
            return set.first();
        }
       
        return set.last();
    }
}