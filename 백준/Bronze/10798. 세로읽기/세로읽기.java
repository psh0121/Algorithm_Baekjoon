import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        String[] arr = new String[5];
        int maxLen = 0;
        for(int i = 0; i < 5; i++) {
            arr[i] = sc.next();
            maxLen = Math.max(maxLen, arr[i].length());
        }

        // 띄어쓰기로 재정비
        for(int i = 0; i < 5; i++) {
            if(arr[i].length() < maxLen) {
                arr[i] = arr[i] + " ".repeat(maxLen - arr[i].length());
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int idx = 0; idx < maxLen; idx++) {
            for(int i = 0; i < 5; i++) {
                if(arr[i].charAt(idx) != ' ') sb.append(arr[i].charAt(idx));
            }
        }

        System.out.println(sb.toString().trim());
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}
