// E E E E E
// D D D D D
// C C C C C
// B B B B B
// A A A A A

public class Pattern28 {
    public static void main(String[] args) {
        int n = 5;
        for(char i = (char)(64 + n); i >= 'A'; i--) {
            for(int j = 1; j <= n; j++) {
                System.out.print(" " + i);
            }
            System.out.println();
        }
    }
}
