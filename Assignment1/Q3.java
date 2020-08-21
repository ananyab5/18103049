import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of vertices: ");
        int V = scanner.nextInt();

        int[][] graph = new int[V+1][V+1];

        System.out.println("Enter number of edges: ");
        int E = scanner.nextInt();

        for(int i=1; i<=E; i++){
            System.out.println("Enter edge " + i + ": ");

            int a = scanner.nextInt();
            int b = scanner.nextInt();

            System.out.println("Enter weight: ");
            graph[a][b] = scanner.nextInt();
        }

        System.out.println("Enter source: ");
        int src = scanner.nextInt();

        shortestPath(graph, V, src);
    }

    private static void shortestPath(int[][] graph, int V, int src){

        int[] dist = new int[V+1];

        for(int i=0; i<=V; i++){
            dist[i] = Integer.MAX_VALUE;
        }

        dist[src] = 0;

        for(int count=0; count<V-1; count++){

            for(int i=1; i<=V; i++){

                for(int j=1; j<=V; j++){

                    if(graph[i][j] != 0 && dist[i] != Integer.MAX_VALUE &&
                    dist[i] + graph[i][j] < dist[j])
                        dist[j] = graph[i][j] + dist[i];
                }
            }
        }

        //check if negative weight edge exists
        for(int i=1; i<=V; i++){

            for(int j=1; j<=V; j++){

                if(graph[i][j] != 0 && dist[i] != Integer.MAX_VALUE &&
                        dist[i] + graph[i][j] < dist[j]){
                    System.out.println("Negative cycle exists!");
                    return;
                }
            }
        }

        System.out.println();
        printShortestPath(V, src, dist);
    }

    private static void printShortestPath(int V, int src, int[] dist){

        for(int i=1; i<=V; i++){
                System.out.println("Distance of vertex " + i + "= " + dist[i]);
        }
    }
}
