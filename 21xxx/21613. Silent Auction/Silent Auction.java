import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int maxPrice = 0;
        String maxName = "";

        while (n-- > 0) {
            String name = sc.next();
            int price = sc.nextInt();

            if(price > maxPrice) {
                maxPrice = price;
                maxName = name;
            }
        }

        System.out.println(maxName);
        sc.close();
    }
}