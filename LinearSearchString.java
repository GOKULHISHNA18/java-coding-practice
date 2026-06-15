public class LinearSearchString {
    public static void main(String[] args) {
        String str = "HELLO";
        char target = 'L';

        int position = -1;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                position = i;
                break;
            }
        }

        if (position != -1) {
            System.out.println("Character found at index: " + position);
        } else {
            System.out.println("Character not found");
        }
    }
}