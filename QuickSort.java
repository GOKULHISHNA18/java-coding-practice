public class QuickSort {

    static int partition(int[] arr, int left, int right) {

        int pivot = arr[left];
        int i = left + 1;
        int j = right;

        while (i <= j) {

            while (i <= right && arr[i] <= pivot) {
                i++;
            }

            while (j >= left && arr[j] > pivot) {
                j--;
            }

            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap pivot with j
        int temp = arr[left];
        arr[left] = arr[j];
        arr[j] = temp;

        return j;
    }

    static void quickSort(int[] arr, int left, int right) {

        if (left < right) {

            int pivotIndex = partition(arr, left, right);

            quickSort(arr, left, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, right);
        }
    }

    public static void main(String[] args) {

        int[] arr = {5, 4, 3, 7, 2, 8, 1};

        quickSort(arr, 0, arr.length - 1);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}