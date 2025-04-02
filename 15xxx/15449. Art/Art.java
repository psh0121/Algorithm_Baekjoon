import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = {
            sc.nextInt(), sc.nextInt(), sc.nextInt(),
            sc.nextInt(), sc.nextInt()
        };

        int cnt = 0;

        for(int i = 0; i < 5; i++) {
            for(int j = i+1; j < 5; j++) {
                for(int k = j+1; k < 5; k++) {
                    int[] arr = {num[i], num[j], num[k]};
                    Arrays.sort(arr);

                    int a = arr[2];
                    int b = arr[1];
                    int c = arr[0];

                    if(a < b + c) {
                        cnt++;
                    }
                }
            }
        }

        System.out.println(cnt);
        sc.close();
    }
}
