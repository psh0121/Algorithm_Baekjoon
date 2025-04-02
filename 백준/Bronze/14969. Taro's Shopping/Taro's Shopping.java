import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            if(n == 0 && m == 0) break;

            int[] price = new int[n];
            for(int i = 0; i < n; i++)price[i] = sc.nextInt();

            int maxPrice = -1;

            for(int i = 0; i < n; i++) {
                for(int j = i+1; j < n; j++) {
                    if(price[i] + price[j] <= m) {
                        maxPrice = Math.max(maxPrice, price[i] + price[j]);
                    }
                }
            }

            System.out.println(maxPrice == -1 ? "NONE" : maxPrice);
        }

        sc.close();
    }
}