// A B C D E
// A B C D E
// A B C D E
// A B C D E
// A B C D E

public class Pattern27 {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i <= n; i++) {
            for(char j = 'A'; j < 65 + n; j++) {
                System.out.print(" " + j);
            }
            System.out.println();
        }
    }
}
