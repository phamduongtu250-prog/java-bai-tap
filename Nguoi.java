public class Nguoi {
    protected String hoTen;
    protected int tuoi;
    protected String queQuan;
    protected String maSoGV;

    public Nguoi(String hoTen, int tuoi, String queQuan, String maSoGV) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.queQuan = queQuan;
        this.maSoGV = maSoGV;
    }

    public String getMaSoGV() {
        return maSoGV;
    }

    @Override
    public String toString() {
        return "Mã GV: " + maSoGV +
               ", Họ tên: " + hoTen +
               ", Tuổi: " + tuoi +
               ", Quê quán: " + queQuan;
    }
}