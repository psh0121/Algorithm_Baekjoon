import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        if(m <= 26) {
            System.out.println("SN " + n + alphabet.toUpperCase().charAt(m-1));
        }
        else {
            int cnt = 26;

            for(int i = 0; i < alphabet.length(); i++) {
                for(int j = 0; j < alphabet.length(); j++) {
                    cnt++;

                    if(cnt == m) {
                        System.out.println("SN " + n + alphabet.charAt(i) + alphabet.charAt(j));
                        return;
                    }
                }
            }
        }
        sc.close();
    }
}
