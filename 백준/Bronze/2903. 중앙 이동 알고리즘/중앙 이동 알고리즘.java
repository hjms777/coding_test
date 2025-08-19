import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        int seq = (int) Math.pow(4, num); // 사각형
        int dot = (int) Math.sqrt(seq) + 1; // 점 갯수 (사각형 가로갯수 + 1)
        System.out.println(dot * dot);

    }
}