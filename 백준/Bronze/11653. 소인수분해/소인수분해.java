import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num == 1) {
            return;
        }

        while(num % 2 == 0) {
            num /= 2;
            System.out.println(2);
        }

        for (int i = 3;  i * i <= num; i += 2) {
            if(!primeChk(i)) continue;

            while(num % i == 0) {
                num /= i;
                System.out.println(i);
            }
        }

        if (num > 1) {
            System.out.println(num);
        }
    }

    public static boolean primeChk(int num) {
        int max = (int) Math.sqrt(num);
        for(int i = 2; i <= max; i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}