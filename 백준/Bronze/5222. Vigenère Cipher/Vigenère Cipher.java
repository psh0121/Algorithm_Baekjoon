import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int t = sc.nextInt();

        while (t-- > 0) {
            String a = sc.next();
            String b = sc.next();
            
            int[] aIdx = new int[a.length()];
            for(int i = 0; i < aIdx.length; i++) {
                aIdx[i] = a.charAt(i) - 65;
            }

            StringBuilder sb = new StringBuilder();

            for(int i = 0; i < b.length(); i++) {
                int idx = i % a.length();

                int bAscii = (int)b.charAt(i) - 65;
                int newIdx = (bAscii + aIdx[idx]) % 26;

                sb.append((char)(65 + newIdx));
            }
            System.out.println("Ciphertext: " + sb.toString().trim());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}