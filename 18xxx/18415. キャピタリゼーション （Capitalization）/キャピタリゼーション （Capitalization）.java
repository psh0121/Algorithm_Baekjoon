import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        String result = s.replace("joi", "JOI");

        System.out.println(result);
        sc.close();
    }
}
