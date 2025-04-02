import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idx = 1;

        while (true) {
            String[] arr = sc.nextLine().split(" ");
            char s1 = arr[0].charAt(0);
            char s2 = arr[1].charAt(0);
            StringBuilder sb = new StringBuilder();
            sb.append("Case " + idx++ + "\n");

            if(s1 == '#' && s2 == '#') break;

            int n = Integer.parseInt(sc.nextLine());

            for(int i = 0; i < n; i++) {
                String str = sc.nextLine();

                for(int j = 0; j < str.length(); j++) {
                    char letter = str.charAt(j);

                    if(s1 == Character.toLowerCase(letter) ||
                    s2 == Character.toLowerCase(letter)) {
                        sb.append("_");
                    }
                    else sb.append(letter);
                }
                sb.append("\n");
            }

            System.out.println(sb.toString());
        }
        sc.close();
    }
}