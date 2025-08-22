import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int max = 0;

        int cnt = 0;
        while (cnt <= num) {
            max++;

            if (max % 2 == 0) {
                //짝수 x축 시작
                for (int i = 1; i <= max; i++) {
                    cnt++;
                    if (cnt == num) {
                        System.out.println(i + "/" + (max - i + 1));
                    }
                }
            } else {
                //홀수 y축 시작
                for (int i = 1; i <= max; i++) {
                    cnt++;
                    if (cnt == num) {
                        System.out.println((max - i + 1) + "/" + i);
                    }
                }
            }
        }

    }
}