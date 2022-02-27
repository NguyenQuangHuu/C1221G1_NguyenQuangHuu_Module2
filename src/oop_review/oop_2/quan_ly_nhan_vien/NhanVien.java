package oop_review.oop_2.quan_ly_nhan_vien;

public class NhanVien  extends  CanBo{
    private String congViec = "chưa nhận việc";

    public NhanVien() {
    }

    public NhanVien(String hoTen, int namSinh, boolean gioiTinh, String diaChi) {
        super(hoTen, namSinh, gioiTinh, diaChi);

    }

    public NhanVien(String hoTen, int namSinh, boolean gioiTinh, String diaChi, String congViec) {
        super(hoTen, namSinh, gioiTinh, diaChi);
        this.congViec = congViec;
    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }

    @Override
    public String toString() {
        return "Nhân viên{" +
                "Công việc='" + congViec + '\'' +
                super.toString()+
                '}';
    }
}
