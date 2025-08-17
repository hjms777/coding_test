import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int jinsu = sc.nextInt();
        StringBuffer sb = new StringBuffer();
        while (num != 0) {
            int remain = num % jinsu; // 나머지
            num /= jinsu; // 몫
            if (remain >= 10) {
                char ch = (char) (remain + 55);
                sb.insert(0, ch);
            } else {
                sb.insert(0, remain);
            }
        }
        System.out.println(sb.toString());
        sc.close();
    }
}