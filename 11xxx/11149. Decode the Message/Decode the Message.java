import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while (t-- > 0) {
            String[] arr = sc.nextLine().split(" ");
            StringBuilder sb = new StringBuilder();

            for(int i = 0; i < arr.length; i++) {
                int sum = 0;

                for(int j = 0; j < arr[i].length(); j++) {
                    char letter = arr[i].charAt(j);
                    sum += (char)(letter - 'a');
                }

                if(sum % 27 == 26) sb.append(" ");
                else sb.append((char)('a' + (sum % 27)));
            }

            System.out.println(sb.toString());
        }
        sc.close();
    }
}