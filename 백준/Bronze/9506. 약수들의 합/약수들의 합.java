import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            if(n == -1) return;

            int num = 0;

            List<Integer> list = new ArrayList<>();
            for (int i = 1; i < n; i++) {
                if(n % i == 0) list.add(i);
            }

            // 약수가 없을때
            if (list.isEmpty()) {
                System.out.println(n + " is NOT perfect.");
            }

            for(int a : list) {
                num += a;
            }

            if (num != n) {
                System.out.println(n + " is NOT perfect.");
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(n + " = ");
                for (int i = 0; i < list.size(); i++) {
                    if (i == list.size() - 1) {
                        sb.append(list.get(i));
                    } else {
                        sb.append(list.get(i) + " + ");
                    }
                }
                System.out.println(sb.toString());
            }
        }

    }
}