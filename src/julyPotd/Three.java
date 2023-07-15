package julyPotd;

public class Three {
    static int maxIndexDiff(int[] arr, int n) {
        int maxDiff = 0;


        int[] leftMinIndex = new int[n];
        int[] rightMaxIndex = new int[n];


        leftMinIndex[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftMinIndex[i] = Math.min(arr[i], leftMinIndex[i - 1]);
        }

        rightMaxIndex[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMaxIndex[i] = Math.max(arr[i], rightMaxIndex[i + 1]);
        }

        int i = 0, j = 0;
        while (i < n && j < n) {
            if (leftMinIndex[i] <= rightMaxIndex[j]) {
                maxDiff = Math.max(maxDiff, j - i);
                j++;
            } else {
                i++;
            }
        }

        return maxDiff;
    }


    public static void main(String[] args) {
        int[] arr = {34, 8, 10, 3, 2, 80, 30, 33, 1};
        int n = 9;
        System.out.println(maxIndexDiff(arr, n));

        int[] arr2 = {18, 17};
        int n2 = 2;
        System.out.println(maxIndexDiff(arr2, n2));
    }
}
