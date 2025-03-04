import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> names = new ArrayList<>();

        for(int i = 0; i < n; i++) names.add(sc.next());

        for(String name : names) {
            System.out.println("? " + name);
            System.out.flush();

            int val1 = sc.nextInt();

            System.out.println("? " + name);
            System.out.flush();
            
            int val2 = sc.nextInt();

            if(val1 == 1 || val2 == 1) {
                System.out.println("! " + name);
                System.out.flush();
                return;
            }
        }
        
        sc.close();
    }
}
