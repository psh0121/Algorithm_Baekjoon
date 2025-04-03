import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int v = sc.nextInt();
            int s = Integer.MAX_VALUE;

            // 가능한 부피면적
            for(int a = 1; a <= v; a++) {
                for(int b = 1; b <= v/a; b++) {
                    for(int c = 1; c <= v/a/b; c++) {
                        if(a * b * c == v) {
                            int abcS = (a*b)*2 + (2*a + 2*b)*c;
                            s = Math.min(s, abcS);
                        }
                    }
                }
            }

            System.out.println(s);
        }
        sc.close();
    }
}