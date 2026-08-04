import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập n: ");
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 2; i <= n; i += 2) {
            sum += i;
        }

        System.out.println("Tổng số chẵn = " + sum);
    }
}