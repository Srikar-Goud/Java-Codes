class Solution {
    public void reverse(int[] arr, int n) {
        reverseHelper(arr, 0, n);
    }

    private void reverseHelper(int[] arr, int i, int n) {
        if (i >= n / 2) return;

        // Swap
        int temp = arr[i];
        arr[i] = arr[n - i - 1];
        arr[n - i - 1] = temp;

        reverseHelper(arr, i + 1, n);
    }

    public void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
