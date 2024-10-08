import java.util.Scanner;

public class Test07 {
    static Scanner stdIn = new Scanner(System.in);

    static int readPlusInt() {
        int x;
        do {
            System.out.print("앙의 정숫값:");
            x = stdIn.nextInt();
        } while (x <= 0);
        return x;
    }

    public static void main(String[] args) {
        int x;
        do {
            int n = readPlusInt();

            System.out.print("반대로 읽으면 ");
            while (n > 0) {
                System.out.print(n % 10);
                n /= 10;
            }
            System.out.println("입니다.");

            do {
                System.out.print("다시 한번?(Yes_1/No_0):");
                x = stdIn.nextInt();
            } while (x!=0 && x!=1);
        } while (x == 1);
    }
}
