import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int k = sc.nextInt();

        for(int i = 1; i <= k; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();

            String[] arr = new String[h];
            for(int j = 0; j < h; j++) arr[j] = sc.next();

            StringBuilder sb = new StringBuilder();

            for(int x = 0; x < w; x++) {
                int cost = 0;
                boolean isFind = false;
                for(int y = 0; y < h; y++) {
                    if(arr[y].charAt(x) == 'X') {
                        isFind = true;
                        break;
                    }
                    else if(arr[y].charAt(x) == 'H') cost += 3;
                    else cost++;
                }

                if(isFind) sb.append(cost + " ");
                else sb.append("N ");
            }

            System.out.println("Data Set " + i + ":");
            System.out.println(sb.toString().trim());
            
            if(i != k) System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}

