// 2 
// 2  4 
// 2  4  6
// 2  4  6  8
// 2  4  6  8  10

public class Pattern40 {
    public static void main(String[] args) {
        int n = 5;

        for(int i = 1; i <= n; i++) {
            int x = 2;
            for(int j = 1; j <= i; j++) {
                System.out.print(" " + x + " ");
                x += 2;
            }
            System.out.println();
        }
    }
}
