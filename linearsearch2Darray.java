public class linearsearch2Darray {
    public static void main(String[] args) {

        int[][] arr = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8}
        };

        int target = 7;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    System.out.println("Found at row " + i + ", column " + j);
                    return;
                }
            }
        }

        System.out.println("Element not found");
    }
}