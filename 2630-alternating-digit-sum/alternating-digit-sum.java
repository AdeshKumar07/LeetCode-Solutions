class Solution {
    public int alternateDigitSum(int n) {
        int count = 0;
        int sum = 0;
        while(n > 0){
            int temp = n %10;
            count++;
            if(count % 2 != 0){
                sum-=temp;
            }
            else{
                sum+=temp;
            }
            n/=10;
        }
       int su = (count % 2 != 0)? -sum:sum;
        return su;

        
    }
}