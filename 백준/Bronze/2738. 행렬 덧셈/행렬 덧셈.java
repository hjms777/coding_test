import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] parts = input.split(" ");
        int x = Integer.parseInt(parts[0]);
        int y = Integer.parseInt(parts[1]);

        // 행렬 생성
        int[][] A = new int[x][y];
        int[][] B = new int[x][y];

        int cnt = 0;
        for (int i = 0; i < x * 2; i++) {
            String line = sc.nextLine();
            String[] numbers = line.split(" ");
            for (int j = 0; j < y; j++) {
                if(i < x) {
                    A[cnt][j] = Integer.parseInt(numbers[j]);
                } else {
                    B[cnt][j] = Integer.parseInt(numbers[j]);
                }
            }
            cnt++;
            if (cnt == x) {
                // A 행렬을 모두 읽은 후 B 행렬로 넘어감
                cnt = 0;
            }
        }

        for(int i = 0; i < x; i++) {
            for(int j = 0; j < y; j++) {
                System.out.print((A[i][j] + B[i][j]) + " ");
            }
            System.out.println(); // 각 행의 끝에서 줄바꿈
        }
    }
}
