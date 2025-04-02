import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int cnt = 0;

        while (t-- > 0) {
            String name = sc.next();
            if(name.charAt(0) == 'C') cnt++;
        }

        System.out.println(cnt);
        sc.close();
    }
}