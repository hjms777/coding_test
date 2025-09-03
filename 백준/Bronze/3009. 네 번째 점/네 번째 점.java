import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] X = new int[3];
        int[] Y = new int[3];
        for (int i = 0; i < 3; i++) {
            X[i] = sc.nextInt();
            Y[i] = sc.nextInt();
        }

        StringBuilder sb = new StringBuilder();
        if (X[0] == X[1]) {
            sb.append(X[2]);
        } else if (X[1] == X[2]) {
            sb.append(X[0]);
        } else if(X[2] == X[0]) {
            sb.append(X[1]);
        }
        
        sb.append(" ");

        if (Y[0] == Y[1]) {
            sb.append(Y[2]);
        } else if (Y[1] == Y[2]) {
            sb.append(Y[0]);
        } else if(Y[2] == Y[0]) {
            sb.append(Y[1]);
        }

        System.out.println(sb.toString());
    }
}
