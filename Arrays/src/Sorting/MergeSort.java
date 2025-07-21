package Sorting;
import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 56, 8, 5, 58, -1, 0, 78, 2, 0};
        mergeSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            mergeArray(arr, start, mid, end);
        }
    }

    public static void mergeArray(int[] arr, int start, int mid, int end) {
        int[] temp = new int[end-start+1];
        int i = start, j = mid + 1, k = 0;
        
        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= end) {
            temp[k++] = arr[j++];
        }

        for (int x = 0; x < temp.length; x++) {
            arr[start + x] = temp[x];
        }
    }
}
