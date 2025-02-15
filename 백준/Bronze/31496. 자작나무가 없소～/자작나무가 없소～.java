import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        int result = 0;

        for(int i = 0; i < n; i++) {
            String[] arr = sc.next().split("_");
            int cnt = sc.nextInt();

            boolean isContain = false;
            
            for(int j = 0; j < arr.length; j++) {
                if(arr[j].equals(s)) {
                    isContain = true;
                    break;
                }
            }

            if(isContain) result += cnt;
        }

        System.out.println(result);
        sc.close();
    }
}