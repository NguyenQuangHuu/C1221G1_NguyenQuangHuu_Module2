package oop_review.oop_2.quan_ly_nhan_vien;

public class CanBo {
    private String hoTen;
    private int namSinh;
    private boolean gioiTinh;
    private String diaChi;


    public CanBo() {
    }

    public CanBo(String hoTen, int namSinh, boolean gioiTinh, String diaChi) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "{" +
                "Họ và tên='" + this.getHoTen() + '\'' +
                ", năm sinh=" + this.getNamSinh() +
                ", giới tính=" + (this.isGioiTinh() ? "Nam ": "Nữ ") +
                ", địa chỉ='" + this.getDiaChi() + '\'' +
                '}';
    }
}
