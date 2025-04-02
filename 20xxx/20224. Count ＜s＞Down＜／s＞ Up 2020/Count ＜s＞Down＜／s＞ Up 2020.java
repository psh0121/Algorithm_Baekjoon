import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if(n == 0) break;
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < n; i++)sb.append(sc.next());

            int cnt = 0;

            for(int i = 0; i <= n - 4; i++) {
                String str = sb.toString().substring(i, i+4);

                if(str.equals("2020")) cnt++;
            }

            System.out.println(cnt);
        }
        sc.close();
    }
}