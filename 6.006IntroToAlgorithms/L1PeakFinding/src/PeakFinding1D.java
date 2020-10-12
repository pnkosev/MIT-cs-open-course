public class PeakFinding1D {

    public static int linearPeakFinding(int[] arr) {
        int peakIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            int currentNum = arr[i];

            if (i == 0 && currentNum > arr[i + 1]) {
                peakIndex = i;
                break;
            } else if (i == arr.length - 1 && currentNum > arr[i - 1]) {
                peakIndex = i;
                break;
            } else if (i > 0 && i < arr.length - 1) {
                int nextNum = arr[i + 1];
                int previousNum = arr[i - 1];

                if (currentNum > previousNum && currentNum > nextNum) {
                    peakIndex = i;
                    break;
                }
            }
        }

        return peakIndex;
    }

    public static int binaryPeakFinding(int[] arr, int l, int r) {
        int m = (l + r) / 2;

        if (m == 0) {
            return 0;
        }

        if (m == arr.length - 1) {
            return arr.length - 1;
        }

        if (arr[m] > arr[m - 1] && arr[m] > arr[m + 1]) {
            return m;
        }

        if (arr[m] > arr[m - 1]) {
            return binaryPeakFinding(arr, m + 1, r);
        } else {
            return binaryPeakFinding(arr, 0, m - 1);
        }
    }
}
