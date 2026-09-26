class Solution {
    public void rotate(int[] nums, int k) {
        
        int n=nums.length;
        k=k%n;
        int[] arr1=new int[k];

        int[] arr2=new int[n-k];
        for(int i=0;i<k;i++){
            arr1[i]=nums[n-k+i];
        }
        for(int i=0;i<n-k;i++){
            arr2[i]=nums[i];
        }
        int[] res=new int[nums.length];
        for(int i=0;i<k;i++){
            res[i]=arr1[i];
        }
        for(int i=0;i<n-k;i++){
            res[k+i]=arr2[i];
        }
        for(int i=0;i<n;i++){
            nums[i]=res[i];
        }

    }
}