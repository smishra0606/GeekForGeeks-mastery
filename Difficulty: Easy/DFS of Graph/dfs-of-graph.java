class Solution {
    public void dfsHelper(int node, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> result, boolean[] visited){
        visited[node]=true;
        result.add(node);
        for(int n:adj.get(node)){
            if(!visited[n]){
                dfsHelper(n, adj,result,visited);
            }
        }
    }
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList result=new ArrayList<>();
        int v=adj.size();
        boolean[] visited =new boolean[v];
        dfsHelper(0,adj,result,visited);
        return result;
    }
}