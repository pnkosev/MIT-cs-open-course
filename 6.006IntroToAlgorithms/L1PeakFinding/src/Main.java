public class Main {

    public static void main(String[] args) {

        int[] arr = { 6, 7, 4, 3, 2, 1, 4, 5 };
        int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8 };

        System.out.println(PeakFinding1D.linearPeakFinding(arr));
        System.out.println(PeakFinding1D.linearPeakFinding(arr1));
        System.out.println(PeakFinding1D.binaryPeakFinding(arr, 0, arr.length - 1));
        System.out.println(PeakFinding1D.binaryPeakFinding(arr1, 0, arr.length - 1));
    }
}
