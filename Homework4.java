import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two numbers:");

        int m = scanner.nextInt();
        int n = scanner.nextInt();

        System.out.println("GCD: " + gcd(m, n));
    }

    public static int gcd(int m, int n) {
        while (n != 0) {
            if (m % n == 0)
                return n;

            int temp = m;
            m = n;
            n = temp %n;
        }

        return m;
    }
}
