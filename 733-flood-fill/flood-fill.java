class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int original = image[sr][sc];

        if (original == color)
            return image;

        int rows = image.length;
        int cols = image[0].length;

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{sr, sc});

        // Mark the starting cell as visited by changing its color.
        image[sr][sc] = color;

        int[][] directions = {
            {-1, 0}, // Up
            {1, 0},  // Down
            {0, -1}, // Left
            {0, 1}   // Right
        };

        while (!queue.isEmpty()) {

            int[] current = queue.poll();
            int r = current[0];
            int c = current[1];

            for (int[] dir : directions) {

                int nr = r + dir[0];
                int nc = c + dir[1];

                if (nr >= 0 && nr < rows &&
                    nc >= 0 && nc < cols &&
                    image[nr][nc] == original) {

                    // Mark as visited before adding to the queue.
                    image[nr][nc] = color;
                    queue.offer(new int[]{nr, nc});
                }
            }
        }

        return image;
    }
}