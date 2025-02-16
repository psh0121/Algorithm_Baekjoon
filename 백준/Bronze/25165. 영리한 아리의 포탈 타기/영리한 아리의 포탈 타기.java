import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a1 = 1;
        int a2 = sc.nextInt();
        int d = sc.nextInt();
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();

        String result = "YES!";

        while (a1 <= n && a2 <= m) {
            if(d == 0) {
                a2--;
                if(a2 == 0) {
                    a2 = 1;
                    a1++;

                    d = d == 0 ? 1 : 0;
                }
            }
            else {
                a2++;
                if(a2 > m) {
                    a2 = m;
                    a1++;

                    d = d == 0 ? 1 : 0;
                }
            }

            // 몬스터 발견
            if(a1 == s1 && a2 == s2) {
                result = "NO...";
                break;
            }
            else if(a1 == n && a2 == m) break;
        }

        System.out.println(result);
        sc.close();
        
    }
}