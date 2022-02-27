package oop_review.oop_2.quan_ly_nhan_vien;

public class CongNhan extends CanBo {
    private int level = 1;

    public CongNhan() {
    }

    public CongNhan(String hoTen, int namSinh, boolean gioiTinh, String diaChi) {
        super(hoTen, namSinh, gioiTinh, diaChi);
    }

    public CongNhan(String hoTen, int namSinh, boolean gioiTinh, String diaChi, int level) {
        super(hoTen, namSinh, gioiTinh, diaChi);
        if(level > 7){
            this.level = 7;
        }else if(level<1){
            this.level = 1;
        }else{
            this.level = level;
        }
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        if(level > 7){
            this.level = 7;
        }else if(level<1){
            this.level = 1;
        }else{
            this.level = level;
        }

    }

    @Override
    public String toString() {
        return "CongNhan{" +
                "Bậc =" + level + "/7"+
                super.toString()+
                '}';
    }
}
