public class CBGV extends Nguoi {
    private double luongCung;
    private double luongThuong;
    private double tienPhat;

    public CBGV(String hoTen, int tuoi, String queQuan, String maSoGV,
                double luongCung, double luongThuong, double tienPhat) {
        super(hoTen, tuoi, queQuan, maSoGV);
        this.luongCung = luongCung;
        this.luongThuong = luongThuong;
        this.tienPhat = tienPhat;
    }

    public double tinhLuongThucLinh() {
        return luongCung + luongThuong - tienPhat;
    }

    @Override
    public String toString() {
        return super.toString() +
               ", Lương cứng: " + luongCung +
               ", Lương thưởng: " + luongThuong +
               ", Tiền phạt: " + tienPhat +
               ", Thực lĩnh: " + tinhLuongThucLinh();
    }
}