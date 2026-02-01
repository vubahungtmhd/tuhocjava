package TruongDH.LyThuyet;

public class Bai30_OOP_BUOI1 {
  public static void main(String[] args) {
    //Khởi tạo đối tượng thuộc class sinh viên
    SinhVien sv1=new SinhVien();
    SinhVien sv2=new SinhVien();
    sv1.hienthithongtin();
    sv2.hienthithongtin();
    SinhVien sv3=new SinhVien("Mai Đào");
    sv3.hienthithongtin();
    SinhVien sv4=new SinhVien("Chi Đần",10);
    sv4.hienthithongtin();
    sv4.hoTen="Obanai";
    sv4.hienthithongtin();
    //Hiển thị thông tin của SV4
    System.out.println(sv4.getHoTen());
    System.out.println(sv4.getDiem());
    //Thay đổi thông tin của SV4
    sv4.setHoTen("Shinazugawa");
    sv4.setDiem(7);
    sv4.hienthithongtin();
    //Có kiểu trả về thì mới có th gán biến
    double diemTBSv4=sv4.tinhDtb(1.5,7.2);

    //set PT toString
    sv4.setDiem(25);
    System.out.println(sv4);//Phải dùng toSting mới hiển thị được
   sv4.checkHopLeDiem();

    // overloading
    double testD= sv4.tinhDtb(5,7,9);
    System.out.println(testD);
    double testD2= sv4.tinhDtb(10,9);
    System.out.println(testD2);
    double kq=sv4.tongDiem(1,2,3,5.5,9.6);
    System.out.println(kq);
  }
}
