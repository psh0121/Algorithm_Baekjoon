import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int n = sc.nextInt();
        int[] room = new int[n];
        for(int i = 0; i < n; i++) room[i] = sc.nextInt();

        int ayuIdx = sc.nextInt() - 1;
        String ayuDirection = sc.next();
        int budiIdx = sc.nextInt() - 1;
        String budiDirection = sc.next();

        int ayu = 0;
        int budi = 0;

        if(ayuDirection.equals("left")) {
            for(int i = 0; i <= ayuIdx; i++) ayu += room[i];
        }
        else {
            for(int i = ayuIdx; i < n; i++) ayu += room[i];
        }

        if(budiDirection.equals("left")) {
            for(int i = 0; i <= budiIdx; i++) {
                if(room[i] == 0) budi++;
            }
        }
        else {
            for(int i = budiIdx; i < n; i++) {
                if(room[i] == 0) budi++;
            }
        }

        System.out.println(ayu + " " + budi);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}

