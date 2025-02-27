package Constructoruniversity;
import java.util.*;

public class RemoveDiameter {


        private static int[] longestPath(int start, List<List<Integer>> adjacent, int n) {
            int[] dist = new int[n + 1];
            Arrays.fill(dist, -1);
            Queue<Integer> queue = new LinkedList<>();
            queue.offer(start);
            dist[start] = 0;

            int farthestNode = start;
            int maxDist = 0;

            while (!queue.isEmpty()) {
                int node = queue.poll();
                for (int neighbor : adjacent.get(node)) {
                    if (dist[neighbor] == -1) {
                        dist[neighbor] = dist[node] + 1;
                        if (dist[neighbor] > maxDist) {
                            maxDist = dist[neighbor];
                            farthestNode = neighbor;
                        }
                        queue.offer(neighbor);
                    }
                }
            }

            return new int[]{farthestNode, maxDist};
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int testCases = scanner.nextInt();

            while (testCases-- > 0) {
                int n = scanner.nextInt();
                int k = scanner.nextInt();

                List<List<Integer>> adj = new ArrayList<>();
                for (int i = 0; i <= n; i++) {
                    adj.add(new ArrayList<>());
                }

                for (int index = 0; index < n - 1; index++) {
                    int u = scanner.nextInt();
                    int v = scanner.nextInt();
                    adj.get(u).add(v);
                    adj.get(v).add(u);
                }


                int[] firstBFS = longestPath(1, adj, n);
                int nodeA = firstBFS[0];

                int[] secondBFS = longestPath(nodeA, adj, n);
                int nodeB = secondBFS[0];
                int diameterLength = secondBFS[1];

                if (diameterLength <= k) {
                    System.out.println(1);
                } else {
                    int validDiameterCount = 0;

                    int[] distA = new int[n + 1];
                    Arrays.fill(distA, -1);
                    distA[nodeA] = 0;
                    Queue<Integer> queueA = new LinkedList<>();
                    queueA.offer(nodeA);

                    while (!queueA.isEmpty()) {
                        int node = queueA.poll();
                        for (int neighbor : adj.get(node)) {
                            if (distA[neighbor] == -1) {
                                distA[neighbor] = distA[node] + 1;
                                queueA.offer(neighbor);
                            }
                        }
                    }

                    for (int node = 1; node <= n; node++) {
                        if (distA[node] <= k) {
                            validDiameterCount++;
                        }
                    }

                    System.out.println(validDiameterCount);
                }
            }
        }


}
