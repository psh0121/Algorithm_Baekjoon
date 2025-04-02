import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            // 수가 2이하면 1은 첫번째에 있고 그외에는 3번째에 있다.
            int num = sc.nextInt();

            System.out.println(num <= 2 ? 1 : 3);
        }
        sc.close();
    }
}
