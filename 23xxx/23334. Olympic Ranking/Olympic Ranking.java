import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        String name99 = "";
        int g99 = 0;
        int s99 = 0;
        int b99 = 0;

        while (t-- > 0) {
            int g = sc.nextInt();
            int s = sc.nextInt();
            int b = sc.nextInt();
            String name = sc.nextLine();

            if(g > g99) {
                name99 = name;
                g99 = g;
                s99 = s;
                b99 = b;
            }
            else if(g == g99) {
                if(s > s99) {
                    name99 = name;
                    g99 = g;
                    s99 = s;
                    b99 = b;
                }
                else if(s == s99) {
                    if(b > b99) {
                        name99 = name;
                        g99 = g;
                        s99 = s;
                        b99 = b;
                    }
                }
            }
        }

        System.out.println(name99.trim());
        sc.close();
    }
}