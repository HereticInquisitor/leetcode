import java.util.*;

class Solution {
    public ArrsyList <Integer> bfs(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList <Integer> bfs = new ArrayList<>();
        boolean vis[] = new boolean[V];
        Queue <Integer> q = new LinkedList <>();

        q.add(0);
        vis[0] = true;

        while(!q.isEmpty()) {
            Integer node = q.poll();
            bfs.add(node);

            for(Integer it: adj.get(node)) {
                if(vis[it] == false) {
                    vis[it] = true;
                    q.add(it);
                }
            }
        }
        return bfs;

    }
}

public class BFS {
    public static void main(String args[]) {
        Solution ay = new Solution();
        ArrayList <ArrayList <Integer>> ad = new ArrayList <ArrayList <Integer>> ();
        
        ArrayList <Integer> res = ay.bfs(5,{{1,2}
                                            {1,3}
                                            {1,4}
                                            {3,5}});
        System.out.println(Arrays.toString(res));
    }
}