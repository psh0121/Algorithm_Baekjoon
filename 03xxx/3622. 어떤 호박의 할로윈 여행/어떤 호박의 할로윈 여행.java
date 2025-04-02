import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int a = sc.nextInt();
        int B = sc.nextInt();
        int b = sc.nextInt();
        int P = sc.nextInt();

        // 두 고리가 하나라도 판보다 크면 불가능
        if(A > P || B > P) System.out.println("No");

        // 두 고리를 나란히 자를 수 있다면 Yes
        else if(A + B <= P) System.out.println("Yes");

        // A안에 B가 포함되는 경우 Yes
        else if(a >= B) System.out.println("Yes");

        // B안에 A가 포함되는 경우 Yes
        else if(b >= A) System.out.println("Yes");

        else System.out.println("No");
        sc.close();
    }
}
