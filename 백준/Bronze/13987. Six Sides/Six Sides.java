import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[6];
        int[] b = new int[6];

        // 주사위값 입력
        for(int i = 0; i < 6; i++) a[i] = sc.nextInt();
        for(int i = 0; i < 6; i++) b[i] = sc.nextInt();

        int winCnt = 0;
        int totalCnt = 0;   // 같은값이 나온것을 제외한 총 개수

        // 확륡계산
        for(int i = 0; i < 6; i++) {
            for(int j = 0; j < 6; j++) {
                if(a[i] > b[j]) winCnt++;
                if(a[i] != b[j]) totalCnt++;
            }
        }

        System.out.printf("%.5f", (double)winCnt / totalCnt);
        sc.close();
    }
}