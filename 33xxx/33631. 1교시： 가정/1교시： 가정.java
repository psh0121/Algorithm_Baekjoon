import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        int c = sc.nextInt();
        int e = sc.nextInt();
        int b = sc.nextInt();

        int fv = sc.nextInt();
        int cv = sc.nextInt();
        int ev = sc.nextInt();
        int bv = sc.nextInt();

        int t = sc.nextInt();
        int cookie = 0;

        while (t-- > 0) {
            int n = sc.nextInt();
            int i = sc.nextInt();

            if(n == 1) {
                if(f/fv >= i && c/cv >= i && e/ev >= i && b/bv >= i) {
                    cookie += i;

                    f -= fv * i;
                    c -= cv * i;
                    e -= ev * i;
                    b -= bv * i;

                    System.out.println(cookie);
                }
                else System.out.println("Hello, siumii");
            }
            else if(n == 2) {
                f += i;
                System.out.println(f);
            }
            else if(n == 3) {
                c += i;
                System.out.println(c);
            }
            else if(n == 4) {
                e += i;
                System.out.println(e);
            }
            else if(n == 5) {
                b += i;
                System.out.println(b);
            }
        }
        sc.close();
    }
}