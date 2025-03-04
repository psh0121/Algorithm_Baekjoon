import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String card = sc.nextLine();
            if(card.equals("#")) break;

            String[] arr = card.split(" ");

            int cheryl = 0;
            int tania = 0;

            for(int i = 0; i < arr.length - 1; i++) {
                String letter = arr[i];

                if(letter.equals("A")) {
                    cheryl++;
                    continue;
                }

                int num = Integer.parseInt(letter);

                if(num % 2 == 0) tania++;
                else cheryl++;
            }

            if(cheryl > tania) System.out.println("Cheryl");
            else if(cheryl == tania) System.out.println("Draw");
            else System.out.println("Tania");
        }
        sc.close();
    }
}
