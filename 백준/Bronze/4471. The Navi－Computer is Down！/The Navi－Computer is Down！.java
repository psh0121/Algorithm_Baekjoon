import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        
        while (n-- > 0) {
            String n1 = sc.nextLine();
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            double z1 = sc.nextDouble();
            sc.nextLine();

            String n2 = sc.nextLine();
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();
            double z2 = sc.nextDouble();
            sc.nextLine();

            double value = Math.sqrt(
                (x2 - x1) * (x2 - x1) + 
                (y2 - y1) * (y2 - y1) +
                (z2 - z1) * (z2 - z1)
            );

            System.out.printf("%s to %s: %.2f\n", n1, n2, value);
        }
        sc.close();
    }
}