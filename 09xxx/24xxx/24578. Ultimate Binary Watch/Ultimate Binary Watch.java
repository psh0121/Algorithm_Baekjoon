import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] arr = {
            "....", "...*", "..*.", "..**",
            ".*..", ".*.*", ".**.", ".***",
            "*...", "*..*"
        };

        int time = sc.nextInt();
        String one = arr[time/1000];
        time %= 1000;
        String two = arr[time/100];
        time %= 100;
        String three = arr[time/10];
        time %= 10;
        String four = arr[time];

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 4; i++) {
            sb.append(one.charAt(i)).append(" ");
            sb.append(two.charAt(i)).append("   ");
            sb.append(three.charAt(i)).append(" ");
            sb.append(four.charAt(i)).append("\n");
        }
        
        System.out.println(sb.toString().trim());
        sc.close();
    }
}