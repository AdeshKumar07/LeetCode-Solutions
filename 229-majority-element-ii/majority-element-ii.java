import java.util.*;
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> ans=new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            int num=nums[i];
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }
            else{
                map.put(num,1);
            }
 
        }
        Set<Integer> keys=map.keySet();
        for(int key:keys){
            if(map.get(key)>n/3){
                ans.add(key);
            }
        }
    return ans;

    }
}