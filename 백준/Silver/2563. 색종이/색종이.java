import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[100][100];

        int cnt = sc.nextInt();
        for(int i = 0; i < cnt; i++) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            for(int j = x; j < x+10; j++) {
                for(int k = y; k < y+10; k++) {
                    arr[j][k] = 1;
                }
            }
        }

        int answer = 0;
        for(int i = 0; i < 100; i++) {
            for(int j = 0; j < 100; j++) {
                if(arr[i][j] == 1) {
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }
}
