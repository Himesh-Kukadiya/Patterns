//  2  4  6  8 10 
// 12 14 16 18 20
// 22 24 26 28 30
// 32 34 36 38 40
// 42 44 46 48 50

public class Pattern8 {
    public static void main(String[] args) {
        int n = 5, cnt = 2;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                System.out.print(cnt < 10 ? " " + cnt + " " : cnt + " ");
                cnt += 2;
            }
            System.out.println();
        }
    }
}
