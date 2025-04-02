import java.util.Scanner;

public class Main {
    public static boolean isOK(int[] s1, int[] s2, int[] s3) {
        boolean result = false;

        if(
            ((s1[0] - 1 >= 0 && s1[1] - 1 >= 0) && (s2[0] - 1 >= 0 && s3[1] - 1 >= 0)) ||
            ((s1[0] - 1 >= 0 && s1[1] - 1 >= 0) && (s3[0] - 1 >= 0 && s2[1] - 1 >= 0)) ||
            ((s1[0] - 2 >= 0) && (s2[0] - 1 >= 0 && s3[0] - 1 >= 0)) ||
            ((s1[1] - 2 >= 0) && (s2[1] - 1 >= 0 && s3[1] - 1 >= 0))
        ) {
            result = true;
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] s1 = new int[2];
        int[] s2 = new int[2];
        int[] s3 = new int[2];

        for(int i = 0; i < 4; i++) {
            int num = sc.nextInt();
            if(num == 0) s1[0]++;
            else s1[1]++;
        }

        for(int i = 0; i < 4; i++) {
            int num = sc.nextInt();
            if(num == 0) s2[0]++;
            else s2[1]++;
        }

        for(int i = 0; i < 4; i++) {
            int num = sc.nextInt();
            if(num == 0) s3[0]++;
            else s3[1]++;
        }

        if(
            isOK(s1, s2, s3) ||
            isOK(s2, s1, s3) ||
            isOK(s3, s1, s2)
        ) {
            System.out.println("Yes");
        }

        else System.out.println("No");

        sc.close();
    }
}
