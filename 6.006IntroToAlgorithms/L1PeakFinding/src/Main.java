public class Main {

    public static void main(String[] args) {
        int[] bigAssArr = new int[1_000_000];

        for (int i = 1; i <= 1_000_000; i++) {
            bigAssArr[i - 1] = i;
        }

        long linearStart1D = System.currentTimeMillis();
        PeakFinding1D.linearPeakFinding(bigAssArr);
        System.out.printf(
                "Linear 1D search for 1 million elements sorted in ascending order (O(n) complexity) takes %d millis.%n",
                System.currentTimeMillis() - linearStart1D
        );

        long binaryStart1D = System.currentTimeMillis();
        PeakFinding1D.binaryPeakFinding(bigAssArr, 0, bigAssArr.length - 1);
        System.out.printf(
                "Binary 1D search for 1 million elements sorted in ascending order (O(log n) complexity) takes %d millis.%n",
                System.currentTimeMillis() - binaryStart1D
        );

        int[][] matrix = {
                { 10,  8, 10, 10 },
                { 14, 13, 12, 11 },
                { 15,  9, 11, 21 },
                { 16, 17, 19, 20 },
        };

        System.out.println(PeakFinding2D.binaryPeakFinding(matrix, 0, matrix[0].length - 1));
    }
}
