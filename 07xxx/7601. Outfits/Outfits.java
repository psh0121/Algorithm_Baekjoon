import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static String solve(int n, int d, Scanner sc) {
        // 옷장 만들기
        List<Integer> becs = new ArrayList<>();
        List<Integer> cas = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            becs.add(i);
            cas.add(i);
        }

        // 버릴옷
        int bRemove = sc.nextInt();
        int cRemove = sc.nextInt();

        if(bRemove != 0) becs.remove(bRemove - 1);
        if(cRemove != 0) cas.remove(n-cRemove);

        // 값 출력
        StringBuilder sb = new StringBuilder();

        for(int i = 1; i <= d; i++) {
            int b = sc.nextInt();
            int c = sc.nextInt();

            int bValue = b-1;
            int cValue = cas.size()-c;

            int bFind = becs.get(bValue);
            int cFind = cas.get(cValue);

            if(bFind == cFind) {
                sb.append("Day " + i + " ALERT\n");
            }
            else sb.append("Day " + i + " OK\n");
        }

        return sb.toString().trim();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = 1;

        while (true) {
            int n = sc.nextInt();
            int d = sc.nextInt();

            if(n == 0 && n == 0) break;

            System.out.println("Scenario " + i++);
            System.out.println(solve(n, d, sc));
        }
        sc.close();
    }
}
