// 1
// 3  5
// 5  7  9
// 7  9 11 13
// 9 11 13 15 17


public class Pattern43 {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i <= n; i++) {
            int x = i * 2 - 1;
            for(int j = 1; j <= i; j++) {
                System.out.print(x < 10 ? "  " + x : " " + x);
                x += 2;
            }
            System.out.println();
        }
    }
}
