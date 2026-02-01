package CongTy;

public class class_test {
  public static void main(String[] args) {
    /*//Kiểu Dữ Liệu là nhân viên
    NhanVien nv1= new NhanVien("NV1","Bắc Ninh",12345);
    double luongnv1=nv1.tinhLuong();
    System.out.println("Lương NV1 là: "+luongnv1);*/
    //Kiểu dữ liệu là nhan viên hành chính
    NhanvienHanhChinh hc1=new NhanvienHanhChinh("Hành chính 1","Thái Nguyên",1234567);
    double luongHc1= hc1.tinhLuong();
    System.out.println("Lương của Hc1: "+luongHc1);
    //Kiểu dữ liệu là nhân viên di ca
    NhanVienDiCa dc1=new NhanVienDiCa("Nguyễn Văn K0","Hà Nội",1223445);
    double luongDica1=dc1.tinhLuong();

    System.out.println("Lương của nhân viên Đi Ca là: "+luongDica1);
    NhanVienDiCa ca1=new NhanVienDiCa("Hòa","Bắc Ninh",123354923);
    double ca1Luong=ca1.tinhLuong();
    System.out.println("Lương của nhân viên Ca 1 là: "+ca1Luong);
    NhanVienDiCa ca2=new NhanVienDiCa("Hùng","Hải Hậu",1959374,2);
    double ca2Luong =ca2.tinhLuong();
    System.out.println("Lương của nhân viên ca 2 là: "+ca2Luong);
  }
}
