import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int n = sc.nextInt();

        // 직전에 쏜 시간
        int[] pineappleTime = new int[9];
        int[] blueberryTime = new int[9];
        
        int pineappleGrade = 0;
        int blueberryGrade = 0;

        while (n-- > 0) {
            int t = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();

            if(a < 5) {
                pineappleGrade += 100;

                if(pineappleTime[a] == 0) pineappleTime[a] = t;
                else {
                    if(t - pineappleTime[a] <= 10) pineappleGrade += 50;

                    pineappleTime[a] = t;
                }
            }
            else {
                blueberryGrade += 100;

                if(blueberryTime[a] == 0) blueberryTime[a] = t;
                else {
                    if(t - blueberryTime[a] <= 10) blueberryGrade += 50;

                    blueberryTime[a] = t;
                }
            }
        }

        System.out.println(pineappleGrade + " " + blueberryGrade);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}

