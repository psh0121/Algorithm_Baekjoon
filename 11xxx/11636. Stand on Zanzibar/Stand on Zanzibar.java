import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        for(int i = 0; i < n; i++) {
            String[] arr = sc.nextLine().split(" ");
            int[] a = new int[arr.length - 1];
            for(int j = 0; j < a.length; j++) a[j] = Integer.parseInt(arr[j]);

            // 바깥쪽에서 온 개체인지 확인하기
            int cnt = 0;
            for(int j = 0; j < a.length - 1; j++) {
                if(a[j]*2 < a[j+1]) {
                    cnt += a[j+1] - (a[j] * 2);
                }
            }

            System.out.println(cnt);
        }
        sc.close();
    }
}