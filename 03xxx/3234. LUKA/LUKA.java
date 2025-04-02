import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int lX = sc.nextInt();
        int lY = sc.nextInt();
        int pX = 0;
        int pY = 0;

        int n = sc.nextInt();
        String str = "0" + sc.next();

        StringBuilder sb = new StringBuilder();
        
        if(Math.abs(pX - lX) <= 1 && Math.abs(pY - lY) <= 1) sb.append(0).append("\n");

        for(int i = 1; i <= n; i++) {
            char d = str.charAt(i);

            if(d == 'I') {  // 오른쪽
                pX++;
            }
            else if(d == 'S') { // 위쪽
                pY++;
            }
            else if(d == 'Z') { // 왼쪽
                pX--;
            }
            else {  // 아래쪽
                pY--;
            }

            if(Math.abs(pX - lX) <= 1 && Math.abs(pY - lY) <= 1) sb.append(i).append("\n");
        }

        if(sb.toString().length() == 0) System.out.println(-1);
        else System.out.println(sb.toString().trim());
        sc.close();
    }
}