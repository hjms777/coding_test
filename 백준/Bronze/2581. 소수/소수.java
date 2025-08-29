import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        for (int i = M; i <= N; i++) {
            // 1은 소수가 아님
            if (i == 1) {
                continue;
            }

            int max = (int) Math.sqrt(i);
            boolean isPrime = true;
            for (int j = 2; j <= max; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                list.add(i);
            }
        }

        if (list.isEmpty()) {
            System.out.println("-1");
        } else {
            int num = 0;
            for(int i: list) {
                num += i;
            }
            System.out.println(num);
            System.out.println(list.get(0));
        }
    }
}