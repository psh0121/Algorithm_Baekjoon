import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = n;

        while (true) {
            num += 1;
            if(Integer.toString(num).contains("0")) continue;
            else break;
        }

        System.out.println(num);
        sc.close();
    }
}
