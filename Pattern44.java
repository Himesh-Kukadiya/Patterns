// 1
// 3  2
// 6  5  4
// 10  9  8  7

public class Pattern44 {
    public static void main(String[] args) {
        int n = 4;
        int x = 0;
        for(int i = 1; i <= n; i++) {
            x += i;
            for(int j = x; j > x - i; j--) {
                System.out.print(j < 10 ? "  " + j : " " + j);
            }
            System.out.println();
        }
    }
}
