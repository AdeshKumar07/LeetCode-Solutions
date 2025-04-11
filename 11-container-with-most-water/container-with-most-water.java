class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int s=0;
        int e=n-1;
        int maxw=0;
        while(s<e){
            int h=Math.min(height[s],height[e]);
            int l=e-s;
            int a=l*h;
            maxw=Math.max(maxw,a);
            if(height[s]<height[e]){
                s++;
            }
            else{
                e--;
            }
        }
        return maxw;
    }
}