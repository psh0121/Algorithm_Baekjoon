import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int m = sc.nextInt();

        int[] looseArr = new int[n+1];
        int kg = 0;
        for(int i = 1; i < looseArr.length; i++) {
            int loose = sc.nextInt();
            looseArr[i] = loose;
            kg += loose;
        }

        if(kg < m) {
            System.out.println(-1);
            return;
        }
        if(kg == m) {
            System.out.println(1);
            return;
        }

        for(int i = 1; i < looseArr.length; i++) {
            kg -= looseArr[i];

            if(kg < m) {
                System.out.println(i);
                return;
            }
        }
        
        sc.close();
    }
}