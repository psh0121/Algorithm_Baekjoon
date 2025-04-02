import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while (true) {
            int n = sc.nextInt();
            sc.nextLine();

            if(n == 0) break;

            int sum = 0;

            for(int j = 0; j < n; j++) {
                if(j == 0) {
                    sum = sc.nextInt();
                    sc.nextLine();
                    continue;
                }
                
                String[] tempArr = sc.nextLine().trim().split(" ");
                int[] arr = new int[tempArr.length];

                for(int k = 0; k < arr.length; k++) {
                    arr[k] = Integer.parseInt(tempArr[k]);
                }

                if(j == n-1) {
                    for(int k = 0; k < arr.length; k++) {
                        sum += arr[k];
                    }
                }
                else {
                    sum += arr[0];
                    sum += arr[arr.length - 1];
                }
            }

            System.out.println("Case #" + i + ":" + sum);
            i++;
        }
        sc.close();
    }
}
