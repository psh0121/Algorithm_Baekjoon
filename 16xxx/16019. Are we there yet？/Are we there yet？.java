import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = {sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()};

        System.out.printf("%d %d %d %d %d\n", 0, n[0], n[0]+n[1], n[0]+n[1]+n[2], n[0]+n[1]+n[2]+n[3]);
        System.out.printf("%d %d %d %d %d\n", n[0], 0, n[1], n[1]+n[2], n[1]+n[2]+n[3]);
        System.out.printf("%d %d %d %d %d\n",n[0]+n[1], n[1], 0, n[2], n[2]+n[3]);
        System.out.printf("%d %d %d %d %d\n", n[0]+n[1]+n[2], n[1]+n[2], n[2], 0, n[3]);
        System.out.printf("%d %d %d %d %d\n", n[0]+n[1]+n[2]+n[3], n[1]+n[2]+n[3], n[2]+n[3], n[3], 0);
        sc.close();
    }
}
