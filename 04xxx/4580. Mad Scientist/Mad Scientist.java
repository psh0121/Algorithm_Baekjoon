import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while (true) {
            int k = sc.nextInt();
            if(k == 0) break;
            int[] arr = new int[k+1];
            int beforeNum = 0;
            for(int i = 1; i < arr.length; i++) {
                int num = sc.nextInt();
                arr[i] = num - beforeNum;
                beforeNum = num;
            }

            StringBuilder sb = new StringBuilder();

            for(int i = 1; i < arr.length; i++) {
                sb.append((i + " ").repeat(arr[i]));
            }

            System.out.println(sb.toString().trim());
        }
        
        sc.close();
    }
}