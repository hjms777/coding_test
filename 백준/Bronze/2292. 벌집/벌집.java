import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean result = false;
        int cnt = 0;
        int hexagon = 0;

        while (!result) {

            int plus = 6 * cnt; // 증가 갯수
            if(plus == 0) plus = 1;

            hexagon = hexagon + plus; // 육각형 갯수

            if (num >= (hexagon - plus) && num <= (hexagon)) {
                result = true;
                System.out.println(cnt + 1);
            }

            cnt++;
        }
        sc.close();
    }
}
