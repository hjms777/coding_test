import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        /*
        MenOfPassion(A[], n) {
         sum <- 0;
         for i <- 1 to n
            for j <- 1 to n
                sum <- sum + A[i] × A[j]; # 코드1
         return sum;
         }
         */
        // f(n) = n^2

        System.out.println(n * n);
        System.out.println(2);
    }
}
