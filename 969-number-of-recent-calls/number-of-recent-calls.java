class RecentCounter {
    List<Integer> ls;
    int i;
    int j;
    public RecentCounter() {
        ls=new ArrayList<>();
        i=0;
        j=-1;
    }
    
    public int ping(int t) {
        ls.add(t);
        j++;
        while(i<j && ls.get(j)-3000 > ls.get(i) ){
            i++;
        }
        return j-i+1;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */