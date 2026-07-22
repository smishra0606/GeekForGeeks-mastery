class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Integer> result=new ArrayList<>();
        int v=adj.size();
        boolean[] visited=new boolean[v];
        Queue<Integer> q=new LinkedList<>();
        q.add(0);
        visited[0]=true;
        while(!q.isEmpty()){
            int curr=q.poll();
            result.add(curr);
            for(int n:adj.get(curr)){
                if(!visited[n]){
                    visited[n]=true;
                    q.add(n);
                }
            }
        }
        return result;
        
    }
}