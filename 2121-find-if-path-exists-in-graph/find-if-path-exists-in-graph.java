class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
       if(source == destination){
        return true;
       }
       ArrayList<ArrayList<Integer>> gp=new ArrayList<>();
       Queue<Integer> q=new LinkedList<>();
       boolean[] vis=new boolean[n];
       for(int i=0;i<n;i++){
        gp.add(new ArrayList<>());
       }
       for(int[] edge:edges){
        int u=edge[0];
        int v=edge[1];
        gp.get(u).add(v);
        gp.get(v).add(u);
       }

       q.add(source);
        vis[source]=true;
        while(!q.isEmpty()){
            Integer node=q.poll();
            if(node==destination){
                return true;
            }
            for(int ng:gp.get(node)){
                if(!vis[ng]){
                    vis[ng]=true;
                    q.add(ng);
                }
            }
        }

    return false;

    }
}