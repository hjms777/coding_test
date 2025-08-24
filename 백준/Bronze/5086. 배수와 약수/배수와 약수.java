import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            if (n == 0) {
                break;
            }

            if (n <= m && m % n == 0) {
                System.out.println("factor");
            } else if (n >= m && n % m == 0) {
                System.out.println("multiple");
            } else if (n % m != 0) {
                System.out.println("neither");
            }
        }
    }
}