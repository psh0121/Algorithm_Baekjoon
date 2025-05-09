import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void solve (BufferedReader br) throws IOException{
        int n = Integer.parseInt(br.readLine());
        int[] tree = new int[n];

        String[] strTree = br.readLine().split(" ");
        for(int i = 0; i < n; i++) tree[i] = Integer.parseInt(strTree[i]);

        // 가장왼쪽에 사과 - 가장 오른쪽 배
        // 가장왼쪽에 배 - 가장 오른쪽 사과
        // 두거리중 가장 긴 값이 정답이된다
        int leftApple = -1;
        int rightPear = -1;
        
        int leftPear = -1;
        int rightApple = -1;
        
        for(int i = 0; i < n; i++) {
            if(tree[i] == 0) {
                leftPear = i;
                break;
            }
        }

        for(int i = 0; i < n; i++) {
            if(tree[i] == 1) {
                leftApple = i;
                break;
            }
        }

        for(int i = n-1; i >= 0; i--) {
            if(tree[i] == 0) {
                rightPear = i;
                break;
            }
        }

        for(int i = n-1; i >= 0; i--) {
            if(tree[i] == 1) {
                rightApple = i;
                break;
            }
        }

        int maxDistance = Math.max(rightPear - leftApple, rightApple - leftPear);

        System.out.println(maxDistance);
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        solve(br);
        br.close();
    }
}

