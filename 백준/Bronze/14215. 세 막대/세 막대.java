import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if (A == B && B == C) {
            System.out.println(A + B + C);
        } else {
            // 제일 높은 값 찾기
            int[] arr = {A, B, C};
            Arrays.sort(arr);

            if (arr[0] + arr[1] <= arr[2]) {
                int i = arr[0] + arr[1];
                System.out.println(i + i - 1);
            } else {
                System.out.println(arr[0] + arr[1] + arr[2]);
            }
        }
    }
}