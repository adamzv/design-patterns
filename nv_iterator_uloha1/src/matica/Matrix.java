package matica;

public class Matrix {
    private int[][] matrix;

    public Matrix(int m, int n) {
        matrix = new int[m][n];
        fill();
    }

    private final void fill() {
        int value = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = value++;
            }
        }
    }

    public void setValue(int i, int j, int value) {
        matrix[i][j] = value;
    }

    public int getValue(int i, int j) {
        return matrix[i][j];
    }

    public MatrixIterator createRowIterator() {
        return new MatrixRowIterator();
    }

    public MatrixIterator createColumnIterator() {
        return new MatrixColIterator();
    }

    private class MatrixRowIterator implements MatrixIterator {
        private int rowPos = 0;
        private int colPos = 0;

        @Override
        public boolean hasNext() {
            return (rowPos < matrix.length) && (colPos < matrix[0].length);
        }

        @Override
        public Integer next() {
            int h = matrix[rowPos][colPos];
            colPos++;
            if (colPos == matrix[0].length) {
                colPos = 0;
                rowPos++;
            }
            return h;
        }
    }

    private class MatrixColIterator implements MatrixIterator {
        private int rowPos = 0;
        private int colPos = 0;

        @Override
        public boolean hasNext() {
            return (rowPos < matrix.length) && (colPos < matrix[0].length);
        }

        @Override
        public Integer next() {
            int h = matrix[rowPos][colPos];
            rowPos++;
            if (rowPos == matrix.length) {
                rowPos = 0;
                colPos++;
            }
            return h;
        }
    }

}