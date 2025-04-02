import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        int cnt = 0;

        for(int i = 0; i < n; i++) {
            if(i % 2 == 0 && s.charAt(i) != 'I') cnt++;
            else if(i % 2 == 1 && s.charAt(i) != 'O') cnt++;
        }

        System.out.println(cnt);
        sc.close();
    }
}