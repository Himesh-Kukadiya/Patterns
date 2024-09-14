// 0  1  0  1  0 
// 1  0  1  0  1 
// 0  1  0  1  0 
// 1  0  1  0  1
// 0  1  0  1  0

public class Pattern18 {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 0; i < n; i++) {
            for(int j = i; j < n + i; j++) {
                System.out.print(" " + j%2 + " ");
            }
            System.out.println();
        }
    }
}
