import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if (n == 1) {
            System.out.println(0);
            return;
        }
        TreeSet<Integer> x = new TreeSet<>();
        TreeSet<Integer> y = new TreeSet<>();
        for(int i = 0; i < n; i++) {
            x.add(sc.nextInt());
            y.add(sc.nextInt());
        }

        int realX = x.last() - x.first();
        int realY = y.last() - y.first();

        System.out.println(realX * realY);
    }
}