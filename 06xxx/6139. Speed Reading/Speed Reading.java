import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // page
        int k = sc.nextInt();   // cow cnt

        for(int i = 0; i < k; i++) {
            int s = sc.nextInt();   // read
            int t = sc.nextInt();   // max times cnt
            int r = sc.nextInt();   // rest

            int readTime = 0;   // cur read times
            int readPage = 0;   // cur read page
            int totalTime = 0;  // result

            while (readPage < n) {
                readPage += s;
                readTime++;
                totalTime++;

                if(readPage >= n) break;

                if(readTime == t) {
                    totalTime += r;
                    readTime = 0;
                }

                if(readPage >= n) break;
            }

            System.out.println(totalTime);
        }
        sc.close();
    }
}
