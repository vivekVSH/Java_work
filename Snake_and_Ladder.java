import java.util.LinkedList;
import java.util.Queue;

public class Snake_and_Ladder {
    public int snakesAndLadders(int[][] board) {
        int n = board.length;
        int[] flat = new int[n * n + 1]; // 1-indexed

        // Flatten the board with Boustrophedon order
        int idx = 1;
        boolean leftToRight = true;
        for (int row = n - 1; row >= 0; row--) {
            if (leftToRight) {
                for (int col = 0; col < n; col++) {
                    flat[idx++] = board[row][col];
                }
            } else {
                for (int col = n - 1; col >= 0; col--) {
                    flat[idx++] = board[row][col];
                }
            }
            leftToRight = !leftToRight;
        }

        // BFS
        boolean[] visited = new boolean[n * n + 1];
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] { 1, 0 }); // {position, moves}
        visited[1] = true;

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int pos = curr[0], moves = curr[1];

            for (int i = 1; i <= 6; i++) {
                int next = pos + i;
                if (next > n * n)
                    break;

                if (flat[next] != -1) {
                    next = flat[next]; // take snake or ladder
                }

                if (next == n * n) {
                    return moves + 1;
                }

                if (!visited[next]) {
                    visited[next] = true;
                    queue.offer(new int[] { next, moves + 1 });
                }
            }
        }

        return -1; // not reachable
    }

    public static void main(String[] args) {
        Snake_and_Ladder sol = new Snake_and_Ladder();

        int[][] board1 = {
            {-1, -1, -1, -1, -1, -1},
            {-1, -1, -1, -1, -1, -1},
            {-1, -1, -1, -1, -1, -1},
            {-1, 35, -1, -1, 13, -1},
            {-1, -1, -1, -1, -1, -1},
            {-1, 15, -1, -1, -1, -1}
        };

        int[][] board2 = {
            {-1, -1},
            {-1, 3}
        };

        System.out.println("Output 1: " + sol.snakesAndLadders(board1)); // Expected: 4
        System.out.println("Output 2: " + sol.snakesAndLadders(board2)); // Expected: 1
    
    }
}