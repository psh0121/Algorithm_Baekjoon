import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] hate = new String[n];
        for(int i = 0; i < n; i++) hate[i] = sc.next();

        int t = sc.nextInt();
        sc.nextLine();

        int cnt = 0;

        while (t-- > 0) {
            sc.next();
            String[] topping = sc.nextLine().split(" ");
            boolean isOK = true;

            for(int i = 0; i < n; i++) {
                if(Arrays.asList(topping).contains(hate[i])) {
                    isOK = false;
                    break;
                }
            }

            if(isOK) cnt++;
        }

        System.out.println(cnt);
        sc.close();
    }
}