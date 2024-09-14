// 1  2  3  4  5 
// 2  3  4  5  6
// 3  4  5  6  7
// 4  5  6  7  8
// 5  6  7  8  9

public class Pattern16 {
    public static void main(String[] args) {
        int n = 5;

        for(int i = 1; i <= n; i++) {
            for(int j = i; j <= i+n - 1; j++) {
                System.out.print(j < 10 ? " " + j + " " : j + " ");
            }
            System.out.println();
        }
    }
}
