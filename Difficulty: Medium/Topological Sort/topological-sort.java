class Solution {
    public void dfs(int node, ArrayList<ArrayList<Integer>> adj, boolean[] visited, Stack<Integer> st){
        visited[node]=true;
        for(int n: adj.get(node)){
            if(!visited[n]){
                dfs(n,adj,visited,st);
            }
        }
        st.push(node);
    }
    public ArrayList<Integer> topoSort(int V, int[][] edges) {
        // code here
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for (int i = 0; i < V; i++) { 
            adj.add(new ArrayList<>()); 
        }
        
        for(int[] edge: edges){
            int u=edge[0];
            int v=edge[1];
            adj.get(u).add(v);
        }
        boolean[] visited=new boolean[V];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<V;i++){
            if(!visited[i]){
                visited[i]=true;
                dfs(i,adj,visited,st);
            }
        }
        ArrayList<Integer> result=new ArrayList<>();
        while(!st.isEmpty()){
            result.add(st.pop());
        }
        return result;
    }
}