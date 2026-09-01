class Solution {
    public int[] sortArray(int[] nums) {
        // Initiate recursive merge sort on the full array bounds 🚀
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    public static void mergeFun(int[] arr, int l, int m, int r) {
        // Calculate sizes of temporary subarrays
        int n1 = m + 1 - l;
        int n2 = r - m;
        
        int[] left = new int[n1];
        for (int i = 0; i < n1; i++) {
            left[i] = arr[l + i];
        }
        
        int[] right = new int[n2];
        for (int i = 0; i < n2; i++) {
            right[i] = arr[m + 1 + i];
        }
        
        // Merge the temporary arrays back into the original array 🔄
        int i = 0, j = 0, k = l;
        while (i < n1 || j < n2) {
            // Pick the smaller element or handle exhausted subarray bounds
            if (j == n2 || (i < n1 && left[i] < right[j])) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
    }

    public static void mergeSort(int[] arr, int low, int high) {
        if (low < high) {
            // Avoid overflow while finding the middle point
            int middle = (high - low) / 2 + low;
            
            // Sort first and second halves 🪓
            mergeSort(arr, low, middle);
            mergeSort(arr, middle + 1, high);
            
            // Merge the sorted halves 🤝
            mergeFun(arr, low, middle, high);
        }
    }
}