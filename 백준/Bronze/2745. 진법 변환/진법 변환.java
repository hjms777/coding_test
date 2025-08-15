import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String B = sc.next();
        int jinsu = sc.nextInt();

        int answer = 0;
        for (int i = 0; i < B.length(); i++) {
            char ch = B.charAt(i);
            int num = 0;
            if (ch >= 'A' && ch <= 'Z') {
                num = ch - 'A' + 10;
            } else {
                num = ch - '0';
            }

            answer += num * (int) Math.pow(jinsu, B.length() - 1 - i);
        }
        System.out.println(answer);
    }
}