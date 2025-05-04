import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        String word = sc.next();
        String[] arr = new String[7];
        for(int i = 0; i < 7; i++) arr[i] = sc.next();

        for(int i = 0; i < 7; i++) {
            String value = arr[i];
            String result = "";

            for(int j = 0; j < 5; j++) {
                char wordC = word.charAt(j);
                char valueC = value.charAt(j);

                if(word.contains(Character.toString(valueC))) {
                    if(wordC == valueC) result += "G";
                    else result += "Y";
                }
                else result += "X";
            }

            if(result.equals("GGGGG")) {
                System.out.println("WINNER");
                return;
            }

            if(i == 6) {
                System.out.println("LOSER");
                return;
            }

            System.out.println(result);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}

