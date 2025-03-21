import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int l = sc.nextInt();

            // 첫번째 날이 되기 전의 일수는 제거한다
            if(l != 1) n -= (m-l+1);

            int monday = 0;

            // 1년에 몇주인지 파악하고 그것으로 인해 월요일 개수를 파악한다
            monday += (n/m);

            // 만약 요일이 남아있다면 +1해준다
            if(n % m != 0) monday++;

            System.out.println(monday);
        }
        
        sc.close();
    }
}