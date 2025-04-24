import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        s = s.replaceAll("[BTAR]", "");
        s = s.replaceAll("O+", "O");

        boolean result = s.contains("IOI");

        System.out.println(result ? "Yes" : "No");
        sc.close();
    }
}