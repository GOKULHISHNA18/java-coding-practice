import java.util.Scanner;

public class prep {

    public static int findmax(String s, int k, char ch) {
        int left = 0;
        int count = 0;
        int ans = 0;

        for (int right = 0; right < s.length(); right++) {

            if (s.charAt(right) != ch) {
                count++;
            }

            while (count > k) {
                if (s.charAt(left) != ch) {
                    count--;
                }
                left++;
            }

            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }

    public static int maxans(String answerkey, int k) {
        int maxT = findmax(answerkey, k, 'T');
        int maxF = findmax(answerkey, k, 'F');

        return Math.max(maxT, maxF);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String answerkey = sc.nextLine();

        int k = sc.nextInt();

        int res = maxans(answerkey, k);

        System.out.println( res);

        sc.close();
    }
}