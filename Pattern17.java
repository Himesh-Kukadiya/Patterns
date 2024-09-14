// 1  3  5  7  9 
// 3  5  7  9 11
// 5  7  9 11 13
// 7  9 11 13 15
// 9 11 13 15 17


public class Pattern17 {
    public static void main(String[] args) {
        int n = 5;

        for(int i = 1; i <= n * 2; i++) {
            for(int j = i; j <= (n * 2) + (i - 1); j++) {
                System.out.print(j < 10 ? " " + j + " " : j + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
