import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class SingleSourceShortestPathNonNegativeWeight {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        SingleSourceShortestPathNonNegativeWeight m = new SingleSourceShortestPathNonNegativeWeight();
        
        while(in.hasNext()) {
            m.run(in);
        }
        
        in.close();
    }
    
    private void run(Scanner in) {
        int n = in.nextInt();
        int m = in.nextInt();
        int q = in.nextInt();
        int s = in.nextInt();

        if(n == 0 && m == 0 && q == 0 && s == 0) return;

        // Create Datastructure

        int[] dist = new int[n];
        ArrayList<Edge>[] nodes = new ArrayList[n];

        for(int i = 0; i < n; i++) {
                nodes[i] = new ArrayList<Edge>();
        }

        for(int i = 0; i < m; i++) {
            int u = in.nextInt();
            int v = in.nextInt();
            int w = in.nextInt();

            nodes[u].add(new Edge(v, w));
        }
        
        // Dijkstra

        PriorityQueue<Edge> heap = new PriorityQueue<Edge>();
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[s] = 0;
        heap.add(new Edge(s, 0));

        while (!heap.isEmpty()) {
            Edge cur = heap.poll();

            if (cur.weight > dist[cur.to]) continue;

            for (Edge nxt : nodes[cur.to]) {
                int d = cur.weight + nxt.weight;
                if (d < dist[nxt.to]) heap.add(new Edge(nxt.to, dist[nxt.to] = d));
            }
        }

        // Result
        for(int i = 0; i < q; i++) {
            int ind = in.nextInt();
            System.out.println(dist[ind] == Integer.MAX_VALUE ? "Impossible" : dist[ind]);
        }
    }
}

class Edge implements Comparable<Edge> {
    public int weight, to;

    public Edge(int a, int b) {
        to = a;
        weight = b;
    }

    public int compareTo(Edge a) {
        return weight - a.weight;
    }
}