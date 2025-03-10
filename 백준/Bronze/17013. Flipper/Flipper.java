import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int hCnt = 0;
        int vCnt = 0;

        for(int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);

            if(letter == 'H') hCnt++;
            else vCnt++;
        }

        hCnt %= 2;
        vCnt %= 2;

        int[][] arr = {{1, 2}, {3, 4}};

        if(hCnt == 1) {
            int[] temp = arr[0];

            arr[0] = arr[1];
            arr[1] = temp;
        }

        if(vCnt == 1) {
            int temp0 = arr[0][0];
            int temp1 = arr[1][0];

            arr[0][0] = arr[0][1];
            arr[1][0] = arr[1][1];
            arr[0][1] = temp0;
            arr[1][1] = temp1;
        }

        System.out.println(arr[0][0] + " " + arr[0][1]);
        System.out.println(arr[1][0] + " " + arr[1][1]);
        sc.close();
    }
}