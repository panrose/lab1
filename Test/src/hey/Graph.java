package hey;

import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Graph {
    private int[][] graph;
    private static int CAB = 100000000;
    public void graphBuild( Map<String, Integer> nei,Map<String, Integer> nUm) {
            int numsize = nUm.size();
            graph = new int[numsize + 1][];
            for (int i = 0; i <= numsize; i++) {
                graph[i] = new int[numsize + 1];
            }
            for (int i = 0; i <= numsize; i++) {
                for (int j = 0; j <= numsize; j++) {
                    graph[i][j] = CAB;
                }
            }
            Set<Entry<String, Integer>> sets = nei.entrySet();
            for (  Entry<String, Integer> entry : sets) {
               String[] list = entry.getKey().split(" -> ");
               graph[nUm.get(list[0])][nUm.get(list[1])] = entry.getValue();
               }
            }
    public int[][] getGraph() {
        return graph;
    }
    public void setGraph(int[][] graph) {
        this.graph = graph;
    }

}
