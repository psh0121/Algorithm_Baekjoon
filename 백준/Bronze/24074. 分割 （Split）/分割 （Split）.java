import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int maxValue = Integer.MIN_VALUE;
        int maxIdx = -1;
        for(int i = 0; i < n; i++) {
            int num = sc.nextInt();
            arr[i] = num;

            if(num > maxValue) {
                maxValue = num;
                maxIdx = i;
            }
        }

        // 왼쪽값과 오른쪽값 각자 더하기
        int left = 0;
        int right = 0;

        for(int i = 0; i < maxIdx; i++) left += arr[i];
        for(int i = n-1; i > maxIdx; i--) right += arr[i];

        System.out.println(left);
        System.out.println(right);

        sc.close();
    }
}