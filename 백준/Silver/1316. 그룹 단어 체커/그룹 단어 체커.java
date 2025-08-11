import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int answer = 0;

        for(int i = 0; i < n; i++) {
            String str = scanner.next();
            int cnt = str.length();

            String str2 = "";
            boolean flag = true;
            Set<String> set = new HashSet<>();
            for(int j = 0; j < cnt; j++) {
                String t = str.substring(j, j+1);
                if(!str2.isEmpty()) {
                    if (!str2.equals(t)) {
                        if(set.contains(t)) {
                            flag = false;
                            break;
                        }
                    }
                }
                set.add(str2);
                str2 = t;
            }
            if(flag) answer++;
        }

        System.out.println(answer);

    }
}