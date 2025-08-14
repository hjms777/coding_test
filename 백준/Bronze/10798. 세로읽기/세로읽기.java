import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[][] arr = new String[5][15];

        for (int i = 0; i < 5; i++) {
            String s = sc.nextLine();
            int y = s.length();
            for (int j = 0; j < y; j++) {
                arr[i][j] = s.substring(j, j + 1);
            }
        }

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if(arr[j][i] != null) {
                    sb.append(arr[j][i]);
                }
            }
        }

        System.out.println(sb.toString());
    }
}
