import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int m = sc.nextInt();
        String result = "No such integer exists.";

        for(int i = 1; i <= m; i++) {
            if((x * i) % m == 1) {
                System.out.println(i);
                return;
            }
        }

        System.out.println(result);
        sc.close();
    }
}