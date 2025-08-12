import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, Double> grade = Map.of(
                "A+", 4.5,
                "A0", 4.0,
                "B+", 3.5,
                "B0", 3.0,
                "C+", 2.5,
                "C0", 2.0,
                "D+", 1.5,
                "D0", 1.0,
                "F", 0.0
        );
        Scanner scanner = new Scanner(System.in);
        double gradeTotal = 0.0; // 학점 x 과목평점 총합
        double creditTotal = 0.0; // 학점 총합
        for (int i = 0; i < 20; i++) {

            String input = scanner.nextLine();

            String[] parts = input.split(" ");

            if(parts[2].equals("P")) {
                continue;
            }

            gradeTotal += grade.get(parts[2]) * Double.parseDouble(parts[1]);
            creditTotal += Double.parseDouble(parts[1]);

        }

        System.out.println(gradeTotal / creditTotal);
    }
}
