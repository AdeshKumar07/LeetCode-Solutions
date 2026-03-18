class Solution {
    static boolean check(int[] arr,int k,int mid){
        int cnt=1;
        int prev=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]-prev>=mid){
                prev=arr[i];
                cnt++;
            }
        }
        return cnt>=k;
    }
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int l=0;
        int h=position[position.length-1]-position[0];
        int res=0;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(check(position,m,mid)){
                res=mid;
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return res;
    }
}