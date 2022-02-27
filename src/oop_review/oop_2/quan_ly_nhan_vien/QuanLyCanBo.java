package oop_review.oop_2.quan_ly_nhan_vien;

import java.util.Comparator;
import java.util.Scanner;

public class QuanLyCanBo implements Comparator<CanBo> {


    static Scanner sc  = new Scanner(System.in);
    @Override
    public int compare(CanBo o1, CanBo o2) {
        int a = 0;
        if(o1 != null && o2 != null){
             a = o1.getHoTen().compareTo(o2.getHoTen());
        }
        return a;
    }


    public void themCanBo(CanBo[] canBos){
        final int NHAN_VIEN = 1;
        final int CONG_NHAN = 2;
        final int KY_SU = 3;
        System.out.println("Bạn lựa chọn cán bộ có chức danh là :\n" +
                "1.Nhân viên\n" +
                "2.Công nhân\n" +
                "3.Kỹ sư");
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice){
            case NHAN_VIEN:input(NHAN_VIEN,canBos);break;
            case CONG_NHAN:input(CONG_NHAN,canBos);break;
            case KY_SU:input(KY_SU,canBos);break;
        }
    }

    public void input(int i,CanBo[] canBos){
        CanBo canBo;
        System.out.println("Nhập họ tên");
        String name = sc.nextLine();
        System.out.println("Nhập năm sinh");
        int dob = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập giới tính (nam : true / nữ : false");
        boolean gender = Boolean.parseBoolean(sc.nextLine());
        System.out.println("Nhập địa chỉ:");
        String address = sc.nextLine();
        if(i == 1){
            System.out.println("Nhập công việc cụ thể");
            String working = sc.nextLine();
            canBo = new NhanVien(name, dob, gender, address, working);
        }else if(i==2){
            System.out.println("Nhập bậc:");
            int level = Integer.parseInt(sc.nextLine());
            canBo = new CongNhan(name, dob, gender, address, level);
        }else{
            System.out.println("Nhập chuyên ngành đào tạo:");
            String subject = sc.nextLine();
            canBo = new KySu(name, dob, gender, address, subject);
        }
        for(int index = 0; index<canBos.length;index++){
            if(canBos[i]==null){
                canBos[i] = canBo;
                break;
            }
        }
    }

    public void show(CanBo[] canBos){
        for (CanBo item:canBos
             ) {
            if(item instanceof CanBo){
                System.out.println(item);
            }
        }
    }

    public void search(CanBo[] canBos){
        System.out.println("Nhập họ tên cán bộ cần tìm");
        String name = sc.nextLine();
        boolean flag = true;
        for(int i = 0; i<canBos.length;i++){
            if(canBos[i] instanceof CanBo){
                if(canBos[i].getHoTen().equals(name)){
                    flag = false;
                    System.out.println("Đã tìm thấy: \n" +
                            "Đây là thông tin cán bộ đã tìm: "+canBos[i].toString());
                }
            }
        }
        if (flag){
            System.out.println("Không tồn tại cán bộ này trong danh sách");
        }
    }
}
