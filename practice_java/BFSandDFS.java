public class BFSandDFS {

    public static void bfs(int startingNode, int numberOfNodes, int[][] matrix, String[] names) {
        boolean[] visited = new boolean[numberOfNodes];
        
        // Manual array based queue
        int[] queue = new int[numberOfNodes];
        int front = 0; 
        int rear = 0;  

        visited[startingNode] = true;
        queue[rear++] = startingNode;

        System.out.println("Starting BFS Traversal:");

        while (front < rear) {
            int curr = queue[front++];
            System.out.print(names[curr] + " ");

            // Check all neighbors in the adjacency matrix
            for (int i = 0; i < numberOfNodes; i++) {
                // matrix[curr][i] == 1 means an edge exists
                if (matrix[curr][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    queue[rear++] = i;
                }
            }
        }
        System.out.println("\n");
    }

    public static void dfs(int startingNode, int numberOfNodes, int[][] matrix, String[] names, boolean[] visited) {
        // Mark current node as visited and print it
        visited[startingNode] = true;
        System.out.print(names[startingNode] + " ");

        // Recursively visit all unvisited neighbors
        for (int j = 0; j < numberOfNodes; j++) {
            if (matrix[startingNode][j] == 1 && !visited[j]) {
                dfs(j, numberOfNodes, matrix, names, visited);
            }
        }
    }

    public static void main(String[] args) {
        
        String[] cities = {"London", "Paris", "Berlin", "Rome"};
        int n = cities.length;

        // Adjacency Matrix representing connections
        // 1 means connected, 0 means no direct path
        int[][] adjMatrix = {
            {0, 1, 1, 0}, 
            {1, 0, 0, 1}, 
            {1, 0, 0, 1}, 
            {0, 1, 1, 0}  
        };

       
        bfs(2, n, adjMatrix, cities);

      
        System.out.println("Starting DFS Traversal:");
        boolean[] visitedArray = new boolean[n]; // Track visited nodes for DFS


        dfs(2, n, adjMatrix, cities, visitedArray);
        
        
        System.out.println();
    }
}