public class merge2sortedarray {

    static int[] merge(int[] arr, int[] brr) {
        int al = arr.length;
        int bl = brr.length;
        int[] crr = new int[al + bl];

        int i = 0, j = 0, k = 0;

        while (i < al && j < bl) {
            if (arr[i] < brr[j]) {
                crr[k] = arr[i];
                i++;
            } else {
                crr[k] = brr[j];
                j++;
            }
            k++;
        }

        while (i < al) {
            crr[k] = arr[i];
            i++ ;
            k++;
        }

        while (j < bl) {
            crr[k] = brr[j];
            j++;
            k++;
        }

        return crr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        int[] brr = {3,7,8, 9};

        int[] res = merge(arr, brr);

        for (int num : res) {
            System.out.print(num + " ");
        }
    }
}