import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // 학생수
        int m = sc.nextInt();   // 여행지수

        int[][] voteArr = new int[m+1][2];  // 투표수, 순서
        for(int i = 0; i < voteArr.length; i++) {
            voteArr[i][1] = i;
        }

        for(int i = 0; i < n; i++) {
            for(int j = 1; j <= m; j++) {
                int vote = sc.nextInt();

                voteArr[j][0] += vote;
            }
        }

        // 정렬
        Arrays.sort(voteArr, (a, b) -> {
            if(a[0] == b[0]) return a[1] - b[1];
            else {
                return b[0] - a[0];
            }
        });

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < voteArr.length; i++) {
            if(voteArr[i][1] == 0) continue;

            sb.append(voteArr[i][1] + " ");
        }

        System.out.println(sb.toString().trim());
        sc.close();
    }
}
