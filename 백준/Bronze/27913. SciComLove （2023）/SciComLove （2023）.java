import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();

        // n 개수만큼 문자열 넣기
        String str = "SciComLove".repeat(n / 10);
        str += "SciComLove".substring(0, n % 10);

        String[] arr = str.split("");
        int cnt = 0;

        // 대문자 개수 파악하기
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].equals(arr[i].toUpperCase())) cnt++;
        }

        for(int i = 0; i < q; i++) {
            int idx = sc.nextInt() - 1;

            // 대문자 -> 소문자
            if(arr[idx].equals(arr[idx].toUpperCase())) {
                arr[idx] = arr[idx].toLowerCase();
                cnt--;
            }
            // 소문자 -> 대문자
            else if(arr[idx].equals(arr[idx].toLowerCase())){
                arr[idx] = arr[idx].toUpperCase();
                cnt++;
            }

            System.out.println(cnt);
        }
        sc.close();
    }
}