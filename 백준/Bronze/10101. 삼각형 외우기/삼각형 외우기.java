import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        // 세 각의 크기가 모두 60이면, Equilateral
        if (A == 60 && B == 60 && C == 60) {
            System.out.println("Equilateral");
        } else if (A + B + C == 180) {
            if (A == B || A == C || B == C) {
                // 세 각의 합이 180이고, 두 각이 같은 경우에는 Isosceles
                System.out.println("Isosceles");
            } else {
                // 세 각의 합이 180이고, 같은 각이 없는 경우에는 Scalene
                System.out.println("Scalene");
            }
        } else {
            // 세 각의 합이 180이 아닌 경우에는 Error
            System.out.println("Error");
        }
    }
}