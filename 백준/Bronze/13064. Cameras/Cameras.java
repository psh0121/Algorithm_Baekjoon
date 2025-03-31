import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {
            String car = sc.next();

            // size 8
            if(car.length() != 8) continue;

            // first, second same number
            int first = car.charAt(0) - '0';
            int second = car.charAt(1) - '0';

            if(first < 1 || first > 9 || second < 1 || second > 9) continue;

            if(first != second) continue;

            // third, fourth 1~9 number
            int third = car.charAt(2) - '0';
            int fourth = car.charAt(3) - '0';

            if(third < 1 || third > 9) continue;
            if(fourth < 1 || fourth > 9) continue;

            // fifth large alphabet
            char fifth = car.charAt(4);

            if(fifth < 'A' || fifth > 'Z') continue;

            // sixth, seventh, eighth 1~9 number
            int sixth = car.charAt(5) - '0';
            int seventh = car.charAt(6) - '0';
            int eighth = car.charAt(7) - '0';

            if(sixth < 1 || sixth > 9) continue;
            if(seventh < 1 || seventh > 9) continue;
            if(eighth < 1 || eighth > 9) continue;

            sb.append(car).append("\n");
        }

        System.out.println(sb.toString());
        sc.close();
    }
}