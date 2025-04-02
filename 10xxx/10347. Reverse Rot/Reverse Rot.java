import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ_.";
        
        while (true) {
            int n = sc.nextInt();
            if(n == 0) break;

            String str = new StringBuilder(sc.next()).reverse().toString();
            StringBuilder result = new StringBuilder();

            for(char c : str.toCharArray()) {
                int idx = alphabet.indexOf(c);
                int calIdx = (idx + n) % 28;

                result.append(alphabet.charAt(calIdx));
            }

            System.out.println(result.toString().trim());
        }

        sc.close();
    }
}