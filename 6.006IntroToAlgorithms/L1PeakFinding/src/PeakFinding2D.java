public class PeakFinding2D {

    public static int binaryPeakFinding(int[][] matrix, int leftCol, int rightCol) {
        int[] colArr = null;
        int rowMaxIndex = -1;

        if (leftCol >= rightCol) {
            colArr = get1DArrFromMatrix(matrix, leftCol);
            rowMaxIndex = getMaxValueIndexFromArray(colArr);
            return colArr[rowMaxIndex];
        }

        int midCol = (leftCol + rightCol) / 2;

        colArr = get1DArrFromMatrix(matrix, midCol);
        rowMaxIndex = getMaxValueIndexFromArray(colArr);

        if (colArr[rowMaxIndex] > matrix[rowMaxIndex][midCol - 1] && colArr[rowMaxIndex] > matrix[rowMaxIndex][midCol + 1]) {
            return colArr[rowMaxIndex];
        }

        if (colArr[rowMaxIndex] > matrix[rowMaxIndex][midCol - 1]) {
            return binaryPeakFinding(matrix, midCol + 1, rightCol);
        } else {
            return binaryPeakFinding(matrix, 0, midCol - 1);
        }
    }

    private static int[] get1DArrFromMatrix(int[][] matrix, int col) {
        int[] colArr = new int[matrix[0].length]; // regular 2D matrix!!!

        for (int i = 0; i < colArr.length; i++) {
            colArr[i] = matrix[i][col];
        }

        return colArr;
    }

    private static int getMaxValueIndexFromArray(int[] arr) {
        int maxValue = Integer.MIN_VALUE;
        int maxValueIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            if (maxValue < arr[i]) {
                maxValue = arr[i];
                maxValueIndex = i;
            }
        }

        return maxValueIndex;
    }
}
