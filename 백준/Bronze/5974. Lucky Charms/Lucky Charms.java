import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();   // 목걸이 길이
        int c = sc.nextInt();   // 장식 개수
        int n = sc.nextInt();   // 손톱 위치

        for(int i = 0; i < c; i++) {
            int s = sc.nextInt();   // 장식길이
            int p = sc.nextInt();   // 장식 위치

            int result = Math.abs(n-p) + s;
            System.out.println(result);
        }
        sc.close();
    }
}