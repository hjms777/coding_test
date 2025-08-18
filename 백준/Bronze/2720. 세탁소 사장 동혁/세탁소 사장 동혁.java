import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int quarter = 25;
        int dime = 10;
        int nickel = 5;
        int penny = 1;
        String[] answer = new String[cnt];
        for (int i = 0; i < cnt; i++) {
            int money = sc.nextInt();
            int q = money / quarter;
            int d = (money - q * quarter) / dime;
            int n = ((money - q * quarter) - d * dime) / nickel;
            int p = (money - q * quarter - d * dime - n * nickel);
            answer[i] = q + " " + d + " " + n + " " + p;
        }

        for (String s : answer) {
            System.out.println(s);
        }
    }
}
