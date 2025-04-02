import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int even = 0;
        int odd = 0;

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

            if(arr[i] % 2 == 0) even++;
            else odd++;
        }

        int num = 0;
        boolean isContain = false;
        if(even > odd) {
            num = 2;
            while(true) {
                isContain = false;
                for(int i = 0; i < n; i++) {
                    if(arr[i] == num) {
                        isContain = true;
                        break;
                    }
                }

                if(!isContain) break;
                num += 2;
            }
        }
        else {
            num = 1;
            while(true) {
                isContain = false;
                for(int i = 0; i < n; i++) {
                    if(arr[i] == num) {
                        isContain = true;
                        break;
                    }
                }

                if(!isContain) break;
                num += 2;
            }
        }

        System.out.println(num);
        sc.close();
    }
}