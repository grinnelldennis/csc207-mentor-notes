/*
  Solution for https://www.hackerrank.com/challenges/dijkstrashortreach/problem
  Referenced: https://stackoverflow.com/questions/683041/how-do-i-use-a-priorityqueue#683049
*/

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the shortestReach function below.
     */
    static int[] shortestReach(int n, int[][] edges, int s) {
      int[] shortestReach = new int[n];
      boolean[] visited = new boolean[n];

      // initialize reach to max value for comparison
      for (int i = 0; i < n; i++)
        shortestReach[n] = Integer.MAX_VALUE;

      // TODO: implement queue

      queue.enqueue(s);
      shortestReach[s] = 0;

      // KEEP RUNNING UNTIL QUEUE EMPTY
      while (queue.isEmpty()){
        // get a node to work with
        int node = queue.dequeue();

        // find all neighbors from s
        //   iterate through first dimension
        for (int i = 0; i < edges.length; i++){
          // left-of-edge originates from node
          if (edges[i][0] == node)
            // update only iff the right-of-edge is not visited
            if (!visited[edges[i][1]]) {
              // update shortest reach to s' neighbors iff weight to edge is lower than existing
              if (shortestReach[edges[i][1]] > shortestReach[edges[i][0]] + edges[i][2])
                // shortestReach is sum of shortestReach to left-of-edge & weight of current node
                shortestReach[edges[i][1]] = shortestReach[edges[i][0]] + edges[i][2];
              // enqueue neighbor base on shortest distance to neighbor
              queue.enqueue(edges[i][1]);
            }
          // do nothing if edge already visited
        }

        //   iterate through second dimension
        for (int i = 0; i < edges.length; i++){
          // right-of-edge originates from node
          if (edges[i][1] == node)
            // update only iff the left-of-edge is not visited
            if (!visited[edges[i][0]]) {
              // update shortest reach to s' neighbors iff weight to edge is lower than existing
              if (shortestReach[edges[i][0]] > shortestReach[edges[i][1]] + edges[i][2])
              // shortestReach is sum of shortestReach to left-of-edge & weight of current node
                shortestReach[edges[i][0]] = shortestReach[edges[i][1]] + edges[i][2];
              // enqueue neighbor based on shortest distance to neighbor
              queue.enqueue(edges[i][0]);
            }
          // do nothing if edge already visited
        }

        // mark s as visited
        visited[node] = true;
      }
      return shortestReach;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(scanner.nextLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nm = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nm[0].trim());

            int m = Integer.parseInt(nm[1].trim());

            int[][] edges = new int[m][3];

            for (int edgesRowItr = 0; edgesRowItr < m; edgesRowItr++) {
                String[] edgesRowItems = scanner.nextLine().split(" ");

                for (int edgesColumnItr = 0; edgesColumnItr < 3; edgesColumnItr++) {
                    int edgesItem = Integer.parseInt(edgesRowItems[edgesColumnItr].trim());
                    edges[edgesRowItr][edgesColumnItr] = edgesItem;
                }
            }

            int s = Integer.parseInt(scanner.nextLine().trim());

            int[] result = shortestReach(n, edges, s);

            for (int resultItr = 0; resultItr < result.length; resultItr++) {
                bufferedWriter.write(String.valueOf(result[resultItr]));

                if (resultItr != result.length - 1) {
                    bufferedWriter.write(" ");
                }
            }

            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }
}
