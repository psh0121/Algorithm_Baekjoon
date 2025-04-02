import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int t = 0;
        int s = 0;

        for(int i = 0; i < n; i++) {
            String str = sc.nextLine().toLowerCase();

            for(int j = 0; j < str.length(); j++) {
                char letter = str.charAt(j);

                if(letter == 't') t++;
                else if(letter == 's') s++;
            }
        }

        System.out.println(t > s ? "English" : "French");
        sc.close();
    }
}