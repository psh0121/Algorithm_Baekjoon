import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int total = sc.nextInt();
        int cnt = 0;

        for(int i = 0; i*a <= total; i++) {
            for(int j = 0; j*b <= total; j++) {
                for(int k = 0; k*c <= total; k++) {
                    if(i*a + j*b + k*c > 0 && i*a + j*b + k*c <= total) {
                        cnt++;
                        System.out.printf("%d Brown Trout, %d Northern Pike, %d Yellow Pickerel\n", i, j, k);
                    }
                }
            }
        }

        System.out.println("Number of ways to catch fish: " + cnt);
        sc.close();
    }
}