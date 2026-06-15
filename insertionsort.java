public class insertionsort {
    public static void main(String[] args) {
        int[] arr = {9, 2, 3, 4, 5, 6, 1};

        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = current;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}