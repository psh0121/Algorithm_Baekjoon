import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int t = sc.nextInt();

        for(int tc = 1; tc <= t; tc++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String mine = sc.next();
            
            String[] compare = new String[n];
            for(int i = 0; i < n; i++) compare[i] = sc.next();

            int mutantCnt = 0;

            for(int i = 0; i < k; i++) {
                boolean isMutant = true;
                for(int j = 0; j < n; j++) {
                    if(compare[j].charAt(i) == mine.charAt(i)) {
                        isMutant = false;
                        break;
                    }
                }

                if(isMutant) mutantCnt++;
            }

            System.out.println("Data Set " + tc + ":");
            System.out.println(mutantCnt + "/" + k);
            if(tc != t) System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}
