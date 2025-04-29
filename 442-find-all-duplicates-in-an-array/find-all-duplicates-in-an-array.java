class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        //Creating a Hashset
        Set<Integer> u_ele=new HashSet<>();
        List<Integer> seen=new ArrayList<>();
        for(int num : nums){
            if(!u_ele.add(num)){
                seen.add(num);

            }
        }
        return seen;

     
        

    }
}