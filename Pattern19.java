// 1  0  1  0  1 
// 0  1  0  1  0
// 1  0  1  0  1
// 0  1  0  1  0
// 1  0  1  0  1

public class Pattern19 {
    public static void main(String[] args) {
        int n = 5;

        for(int i = 1; i <= n; i++) { 
            for(int j = i; j < n + i; j++) {
                System.out.print(" " + j%2 + " ");
            }
            System.out.println();
        }
    }
}
