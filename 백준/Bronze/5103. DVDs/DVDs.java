import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            String title = sc.next();
            if(title.equals( "#")) break;

            int m = sc.nextInt();
            int s = sc.nextInt();

            int t = sc.nextInt();

            while (t-- > 0) {
                char type = sc.next().charAt(0);
                int cnt = sc.nextInt();

                if(type == 'S') {
                    s -= cnt;
                    s = Math.max(0, s);
                }
                else {
                    s += cnt;
                    s = Math.min(m, s);
                }
            }

            System.out.println(title + " " + s);
        }

        sc.close();
    }
}