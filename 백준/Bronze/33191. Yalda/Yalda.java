import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();

        int watermelon = sc.nextInt();
        int pomegranates = sc.nextInt();
        int nuts = sc.nextInt();

        if(b >= watermelon) System.out.println("Watermelon");
        else if(b >= pomegranates) System.out.println("Pomegranates");
        else if(b >= nuts) System.out.println("Nuts");
        else System.out.println("Nothing");
        sc.close();
    }
}