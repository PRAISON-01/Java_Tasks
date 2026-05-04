public class HardestLoop {
    public static void main(String[] args) {
        int n = 15; // Must be odd
        char[][] grid = new char[n][n];
        
        // Initialize grid with spaces
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) grid[i][j] = ' ';

        int top = 0, bottom = n - 1, left = 0, right = n - 1;

        // The Spiral Logic
        while (top <= bottom && left <= right) {
            // 1. Draw top-right boundary
            for (int i = 0; i <= (right - left) / 2; i++) 
                grid[top + i][n/2 + i - (top/2)] = '*';
            
            // 2. Draw bottom-right boundary
            for (int i = 0; i <= (right - left) / 2; i++)
                grid[n/2 + i + (top/2)][right - i] = '*';

            // Shrink boundaries for the inner spiral
            top += 2; bottom -= 2; left += 2; right -= 2;
        }

        // Print the result
        for (char[] row : grid) {
            System.out.println(new String(row));
        }
    }
}

