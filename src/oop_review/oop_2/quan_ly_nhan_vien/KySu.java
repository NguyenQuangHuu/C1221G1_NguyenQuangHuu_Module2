package oop_review.oop_2.quan_ly_nhan_vien;

public class KySu extends CanBo{
    private String nganhDaoTao = "chưa nhận ngành đào tạo";

    public KySu() {
    }

    public KySu(String hoTen, int namSinh, boolean gioiTinh, String diaChi) {
        super(hoTen, namSinh, gioiTinh, diaChi);
    }

    public KySu(String hoTen, int namSinh, boolean gioiTinh, String diaChi, String nganhDaoTao) {
        super(hoTen, namSinh, gioiTinh, diaChi);
        this.nganhDaoTao = nganhDaoTao;
    }

    public String getNganhDaoTao() {
        return nganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }

    @Override
    public String toString() {
        return "Kỹ sư{" +
                "Ngành đào tạo ='" + nganhDaoTao + '\'' +
                super.toString()+
                '}';
    }
}
