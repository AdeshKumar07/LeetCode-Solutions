class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=candies[0];
        ArrayList<Boolean> kk=new ArrayList<>();
        int n=candies.length;
        for(int i=0;i<n;i++){
            if(candies[i]>max){
               max=candies[i];
            }
        }
        for(int i=0;i<n;i++){
            if((candies[i]+extraCandies)>=max){
                kk.add(true);
            }
            else{
                kk.add(false);
            }
        }
       return kk;
    }
}