class Solution {
    public int hIndex(int[] citations) {
        int n=citations.length;
        Arrays.sort(citations);
        int idx=0;
        while(idx<n && citations[n-1-idx]>idx){
            idx+=1;
        }
        return idx;
    }
}