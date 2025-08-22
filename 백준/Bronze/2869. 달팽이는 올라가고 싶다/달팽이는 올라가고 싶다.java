import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int V = sc.nextInt();

        // D 일이 걸린다고 가정
        // D * A 만큼 올라가고 (D-1) * B 만큼 미끄러짐
        // D * A - (D-1) * B >= V
        // D * A - D * B + B >= V
        // D * (A - B) >= V - B
        // D >= (V - B) / (A - B)

        int days = (V - B - 1) / (A - B) + 1;

        System.out.println(days);
    }
}
