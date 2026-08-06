import java.util.Scanner;

public class DiemTongKet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập điểm
        System.out.print("Nhập điểm chuyên cần: ");
        double chuyenCan = sc.nextDouble();

        System.out.print("Nhập điểm giữa kỳ: ");
        double giuaKy = sc.nextDouble();

        System.out.print("Nhập điểm cuối kỳ: ");
        double cuoiKy = sc.nextDouble();

        // Tính điểm tổng kết
        double tongKet = chuyenCan * 0.1 + giuaKy * 0.3 + cuoiKy * 0.6;

        // In kết quả
        System.out.println("Điểm tổng kết = " + tongKet);

        sc.close();
    }
}