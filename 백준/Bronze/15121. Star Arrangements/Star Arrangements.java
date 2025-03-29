import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        sb.append(s).append(":\n");

        for(int i = 2; i < s; i++) {
            for(int j = i-1; j <= i; j++) {
                int rowCnt = s / (i+j);
                if(s % (i+j) == 0) {
                    if(i * rowCnt + j * rowCnt == s) {
                        sb.append(i).append(",").append(j).append("\n");
                    }
                }
                else {
                    if(i * (rowCnt+1) + j * rowCnt == s) {
                        sb.append(i).append(",").append(j).append("\n");
                    }
                }
            }
        }

        System.out.println(sb.toString().trim());
        sc.close();
    }
}