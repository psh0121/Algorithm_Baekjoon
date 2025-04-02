import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long m = sc.nextLong();
        long sum = (long)0;

        for(int i = 0; i < n; i++) sum += sc.nextLong();

        System.out.println(n+m <= sum ? "DIMI" : "OUT");
        sc.close();
    }
}