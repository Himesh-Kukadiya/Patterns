// 1
// 2  3
// 4  5  6
// 7  8  9  10

public class Pattern41 {
    public static void main(String[] args) {
        int n = 4;
        int no = 1;

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(no < 10 ? no + "  " : no + " ");
                no++;
            }
            System.out.println();
        }
    }
}
