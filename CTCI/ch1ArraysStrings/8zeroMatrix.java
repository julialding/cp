public void setZeroes(int[][] matrix) {
    // m (vert) x n (hor) matrix
    int m = matrix.length;
    int n = matrix[0].length;

    boolean[] row = new boolean[matrix.length];
    boolean[] col = new boolean[matrix[0].length];

    // find locations of 0s first
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            if (matrix[i][j] == 0) {
                row[i] = true;
                col[j] = true;
            }
        }
    }

    // iterate through rows
    for (int r = 0; r < m; r++) {
        if (row[r]) {
            for (int i = 0; i < n; i++) {
                matrix[r][i] = 0;
            }
        }
    }

    // iterate through cols
    for (int c = 0; c < n; c++) {
        if (col[c]) {
            for (int i = 0; i < m; i++) {
                matrix[i][c] = 0;
            }
        }
    }
}