public class MergeSingleArrayBut2SideSorted {

    static void merge(int[] arr, int start, int mid, int end) {

        int[] temp = new int[end - start];

        int i = start;
        int j = mid;
        int k = 0;

        while (i < mid && j < end) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i < mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }

        while (j < end) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        // Copy back to original array
        for (int p = 0; p < temp.length; p++) {
            arr[start + p] = temp[p];
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 5, 6, 3, 7, 8};

        int start = 0;
        int end = arr.length;
        int mid = (end/2)+1;

        merge(arr, start, mid, end);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}