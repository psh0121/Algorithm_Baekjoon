import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int t = sc.nextInt();

        for(int tc = 1; tc <= t; tc++) {
            System.out.println("Test case #" + tc + ":");

            // 바꿀문자를 before과 after에 담아서 나중에 replaceAll 할때 사용해준다
            int changeCnt = sc.nextInt();
            String[] before = new String[changeCnt];
            String[] after = new String[changeCnt];
            for(int i = 0; i < changeCnt; i++) {
                before[i] = sc.next();
                after[i] = sc.next();
            }

            // 데이터 입력
            int n = sc.nextInt();
            String[] arr = new String[n];
            for(int i = 0; i < n; i++) arr[i] = sc.next();

            // 데이터 변환
            String[] newArr = new String[n];
            for(int i = 0; i < n; i++) {
                String word = arr[i];

                for(int j = 0; j < changeCnt; j++) {
                    word = word.replaceAll("[" + before[j] + "|" +after[j] + "]", after[j]);
                }

                newArr[i] = word;
            }

            // 팰린드롬인지 확인
            for(int i = 0; i < n; i++) {
                String temp1 = newArr[i];
                String temp2 = new StringBuilder(temp1).reverse().toString();

                boolean same = temp1.equals(temp2);

                System.out.print(arr[i] + " ");
                if(same) System.out.println("YES");
                else System.out.println("NO");
            }

            if(tc != t) System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}

