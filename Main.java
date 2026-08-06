import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLyCBGV ql = new QuanLyCBGV();

        while (true) {
            System.out.println("\\n===== QUẢN LÝ CÁN BỘ GIẢNG VIÊN =====");
            System.out.println("1. Thêm giảng viên");
            System.out.println("2. Xóa giảng viên theo mã");
            System.out.println("3. Hiển thị danh sách");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");

            int chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 1:
                    System.out.print("Họ tên: ");
                    String hoTen = sc.nextLine();

                    System.out.print("Tuổi: ");
                    int tuoi = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Quê quán: ");
                    String que = sc.nextLine();

                    System.out.print("Mã số GV: ");
                    String ma = sc.nextLine();

                    System.out.print("Lương cứng: ");
                    double lc = sc.nextDouble();

                    System.out.print("Lương thưởng: ");
                    double lt = sc.nextDouble();

                    System.out.print("Tiền phạt: ");
                    double tp = sc.nextDouble();

                    ql.them(new CBGV(hoTen, tuoi, que, ma, lc, lt, tp));
                    System.out.println("Đã thêm giảng viên!");
                    break;

                case 2:
                    System.out.print("Nhập mã GV cần xóa: ");
                    String maXoa = sc.nextLine();

                    if (ql.xoaTheoMa(maXoa))
                        System.out.println("Xóa thành công!");
                    else
                        System.out.println("Không tìm thấy giảng viên!");
                    break;

                case 3:
                    ql.hienThi();
                    break;

                case 0:
                    System.out.println("Kết thúc chương trình.");
                    return;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}