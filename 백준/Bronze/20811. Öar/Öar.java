import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        ArrayList<Integer> fibo = new ArrayList<>();
        fibo.add(0);
        fibo.add(1);
        fibo.add(1);

        // 피보나치 데이터 입력
        while (fibo.get(fibo.size() - 1) < 10000) {
            fibo.add(fibo.get(fibo.size() - 1) + fibo.get(fibo.size() - 2));
        }

        int n = sc.nextInt();

        // 몇번 섬에서 사라지는지 파악
        int island = 0;
        int cur = n;

        while (cur > 0) {
            island++;
            cur -= fibo.get(island);
        }

        System.out.println(island);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}
