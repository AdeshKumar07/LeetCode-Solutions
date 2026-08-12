class Solution {
    public static void genrateSubset(int idx,int[] arr, List<Integer> curr, List<List<Integer>> res){
        if(idx>=arr.length){
            res.add(new ArrayList<>(curr));
            return;
        }

        curr.add(arr[idx]);
        genrateSubset(idx+1, arr, curr, res);

        curr.remove(curr.size()-1);

        genrateSubset(idx+1,arr, curr,res);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res= new ArrayList<>();
        genrateSubset(0,nums,new ArrayList<>(), res);
        return res;
        
        
    }
}