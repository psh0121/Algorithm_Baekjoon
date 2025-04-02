import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 0; i < t; i++) {
          int n = sc.nextInt();
          double minGram = Double.MAX_VALUE;
          int minPirce = 0;

          for(int j = 0; j < n; j++) {
            int gram = sc.nextInt();
            int price = sc.nextInt();

            double calValue = (double)price / gram;

            if(calValue < minGram) {
              minGram = calValue;
              minPirce = price;
            }
            else if(calValue == minGram) minPirce = Math.min(minPirce, price);

          }

          System.out.println(minPirce);
        }
        sc.close();
    }
}