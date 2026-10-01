class Solution {
    public int findSpecialInteger(int[] arr) {
        int n=arr.length;
        double fre=n*0.25;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int val:arr){   
            map.put(val,map.getOrDefault(val,0)+1);   
        }
        Set<Integer> keys=map.keySet();
        for(int key:keys){
            if(map.get(key)>fre){
                return key;
            }
        }
        return -1;
    }
}