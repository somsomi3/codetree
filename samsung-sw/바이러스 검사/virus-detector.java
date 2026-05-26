import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int leader = sc.nextInt();
        int member = sc.nextInt();

        long answer = 0;

        for (int i = 0; i < n; i++) {

            arr[i] -= leader;

            answer++;

            if (arr[i] > 0) {
                answer += arr[i] / member;
                if (arr[i] % member != 0) {
                    answer++;
                }
            }
        }

        System.out.println(answer);
    }
}