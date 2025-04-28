import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
       String bee = sc.next();
       int t = sc.nextInt();

       while (t-- > 0) {
        String str = sc.next();

        if(str.length() < 4) continue;

        // 정중앙 값이 있는가?
        if(str.contains(Character.toString(bee.charAt(0)))) {
            boolean isAllContain = true;

            // 다른 값들도 bee로만 이루어져있는가?
            for(int i = 0; i < str.length(); i++) {
                if(!bee.contains(Character.toString(str.charAt(i)))) {
                    isAllContain = false;
                    break;
                }
            }

            if(isAllContain) System.out.println(str);
        }
       }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}
