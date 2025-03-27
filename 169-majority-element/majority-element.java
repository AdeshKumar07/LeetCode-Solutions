class Solution {
    public int majorityElement(int[] nums) {
    //     int m=nums.length;      
    //     int m_j=m/2;
    //     int arr[]=new int[m];        
    //     for(int i=0;i<m;i++){
    //        for(int j=i+1;j<m;j++){
    //         if(nums[i]==nums[j]){
    //             arr[i]=nums[i];
    //         }
    //        }
    //     }
    //   //  int c=arr.length;
    //   if(arr.length>=m/2){
    //     return arr[0];
    //   }
    //  else{
    //     return 0;
    //  }
    int maj=0;
    int count=0;
    for(int i=0;i<nums.length;i++){
        if(count==0){
            maj=nums[i];
        }
        if(nums[i]==maj){
            count++;
        }
        else{
            count--;
        }
    }
    return maj;

    }
}