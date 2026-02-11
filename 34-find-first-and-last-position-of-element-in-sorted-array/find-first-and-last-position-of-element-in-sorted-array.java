class Solution {
    public static int searchIdx(int[] arr, int tar,boolean fi){
        int s=0,e=arr.length-1;
        int ans=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]>tar){
                e=mid-1;
            }
            else if(arr[mid]<tar){
                s=mid+1;
            }
            else{
                ans=mid;
                if(fi){
                    e=mid-1;
                }
                else{
                    s=mid+1;
                }
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int[] ans={-1,-1};
        int fi=searchIdx(nums,target,true);

        int li=searchIdx(nums,target,false);
        ans[0]=fi;
        ans[1]=li;
        return ans;
    }
}