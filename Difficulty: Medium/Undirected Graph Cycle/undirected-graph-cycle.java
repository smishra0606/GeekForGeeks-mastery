class Solution {
    public boolean bfs(int startNode, ArrayList<ArrayList<Integer>> adj, boolean[] visited){
        Queue<Integer> q=new LinkedList<>();
        Map<Integer,Integer> parent=new HashMap<>();
        visited[startNode]=true;
        q.add(startNode);
        parent.put(startNode,-1);
        while(!q.isEmpty()){
            int front=q.poll();
            for(int n:adj.get(front)){
                if(!visited[n]){
                    visited[n]=true;
                    q.add(n);
                    parent.put(n,front);
                }
                else if(parent.get(front) != null && parent.get(front)!=n){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean isCycle(int V, int[][] edges) {
        // Code here
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for( int[] i : edges){
            int u=i[0];
            int v=i[1];
            
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        boolean[] visited=new boolean[V];
        for(int i=0;i<V;i++){
            if(!visited[i]){
                if(bfs(i,adj,visited)){
                    return true;
                }
            }
        }
        return false;
        
    }
}