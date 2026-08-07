import java.util.Scanner;

public class QuanLySinhVien {

    // Hàm nhập điểm hợp lệ từ 0 đến 10
    public static double nhapDiem(Scanner sc, String tenDiem) {
        double diem;
        while (true) {
            System.out.print("Nhập điểm " + tenDiem + ": ");
            diem = sc.nextDouble();

            if (diem >= 0 && diem <= 10) {
                return diem;
            } else {
                System.out.println("Điểm không hợp lệ! Vui lòng nhập lại (0-10).");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập thông tin sinh viên
        System.out.print("Nhập mã sinh viên: ");
        String maSV = sc.nextLine();

        System.out.print("Nhập họ tên: ");
        String hoTen = sc.nextLine();

        // Nhập điểm
        double chuyenCan = nhapDiem(sc, "chuyên cần");
        double giuaKy = nhapDiem(sc, "giữa kỳ");
        double cuoiKy = nhapDiem(sc, "cuối kỳ");

        // Tính điểm tổng kết
        double tongKet = chuyenCan * 0.1 + giuaKy * 0.3 + cuoiKy * 0.6;

        // Xếp loại
        String xepLoai;

        if (tongKet >= 8.5) {
            xepLoai = "A";
        } else if (tongKet >= 7.0) {
            xepLoai = "B";
        } else if (tongKet >= 5.5) {
            xepLoai = "C";
        } else if (tongKet >= 4.0) {
            xepLoai = "D";
        } else {
            xepLoai = "F";
        }

        // Hiển thị kết quả
        System.out.println("\\n===== KẾT QUẢ =====");
        System.out.printf("%s - %s - %.2f - %s%n",
                maSV, hoTen, tongKet, xepLoai);

        sc.close();
    }
}