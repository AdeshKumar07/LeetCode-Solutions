class Solution {
    public int[] searchRange(int[] nums, int target) {
        int fi=FS(nums,target);
        int Si=SS(nums,target);
        return new int[]{fi,Si};
    }
    static int FS(int[] arr, int t){
        int s=0,e=arr.length-1,ans = -1;
        while(s <= e){
            int mid=s+(e-s)/2;
            if(arr[mid] == t){
               ans = mid;
               e = mid - 1;
            }
            else if(t > arr[mid]){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return ans;
    }
    static int SS(int[] arr, int t){
        int s=0,e=arr.length-1,ans = -1;
        while(s <= e){
            int mid=s+(e-s)/2;
            if(arr[mid] == t){
               ans = mid;
               s = mid + 1;
            }
            else if(t > arr[mid]){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return ans;
    }
}