import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] a = sc.nextLine().split(" ");
        String b = sc.nextLine();
        int cnt = 0;

        for(int i = 0; i < a.length; i++) {
            if(a[i].equals(b)) continue;
            
            int idx = a[i].indexOf(b);

            if(idx == 0) cnt++;
        }
        System.out.println(cnt);
        sc.close();
    }
}
