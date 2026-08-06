import java.util.ArrayList;

public class QuanLyCBGV {
    private ArrayList<CBGV> danhSach = new ArrayList<>();

    // Thêm giảng viên
    public void them(CBGV gv) {
        danhSach.add(gv);
    }

    // Xóa theo mã số giáo viên
    public boolean xoaTheoMa(String ma) {
        for (CBGV gv : danhSach) {
            if (gv.getMaSoGV().equalsIgnoreCase(ma)) {
                danhSach.remove(gv);
                return true;
            }
        }
        return false;
    }

    // Hiển thị danh sách
    public void hienThi() {
        if (danhSach.isEmpty()) {
            System.out.println("Danh sách trống!");
            return;
        }

        for (CBGV gv : danhSach) {
            System.out.println(gv);
        }
    }
}