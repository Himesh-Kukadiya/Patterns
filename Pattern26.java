// A A A A A
// B B B B B
// C C C C C
// D D D D D
// E E E E E

public class Pattern26 {
    public static void main(String[] args) {
        int n = 5;

        for(char i = 'A'; i <= 64 + n; i++) {
            for(int j = 1; j <= n; j++) {
                System.out.print(" " + i);
            }
            System.out.println();
        }
    }
}
