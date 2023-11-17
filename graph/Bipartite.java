import java.util.*;
class graph{
    int V;
    List<List<Integer>> adj;
    int colour[];

    graph(int v){
        adj = new ArrayList<>(v);
        for(int i=0;i<v;i++){
            adj.add(new ArrayList<>());
        }
        colour= new int[v];
    }

    void addEdge(int v, int w){
        adj.get(v).add(w);
        adj.get(w).add(v);
    }


    boolean dfs(int node, int col){
        colour[node]=col;
        for(int it: adj.get(node)){
            if(colour[it]==-1){
                if(dfs(it, (1-col))==false)
                    return false;
            }
        }
        return true;
    }

    boolean isBarpartiteP(int V){
        for(int i=0;i<V;i++){
            colour[i]=-1;
        }

        for(int i=0;i<V;i++){
            if(colour[i]==-1){
                if(dfs(i,0)==false)
                    return false;
            }
        }
        return true;
    }
}

public class Bipartite{
    public static void main(String args[]){
        graph g = new graph(6);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,3);
        g.addEdge(2,4);
        g.addEdge(3,5);
        g.addEdge(4,5);

        if(g.isBipartiteP(6))
            System.out.println("IS BIPARTITE");
        
        else
            System.out.println("IS NOT BIPARTITE");

    }
}