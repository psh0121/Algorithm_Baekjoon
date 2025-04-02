import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        for(int i = 0; i < n; i++) {
            String[] arr = sc.nextLine().split(" ");
            StringBuilder sb = new StringBuilder();

            for(int j = 0; j < arr.length; j++) {
                if(arr[j].length() == 4) sb.append("**** ");
                else sb.append(arr[j] + " ");
            }

            System.out.println(sb.toString().trim());
            if(i != n-1) System.out.println();
        }
        sc.close();
    }
}