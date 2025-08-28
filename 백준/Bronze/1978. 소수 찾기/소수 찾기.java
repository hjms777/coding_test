import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int answer = 0;
        for (int i = 0; i < cnt; i++) {
            int num = sc.nextInt();
            int max = (int) Math.sqrt(num);
            boolean isPrime = true;
            if(num == 1) {
                isPrime = false;
            }
            for (int j = 2; j <= max; j++) {
                if(num % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}
