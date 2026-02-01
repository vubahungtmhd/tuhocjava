package BaiTapVanDung.Bai6;

import java.util.List;
import java.util.Scanner;

public class main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    NhaTruong school=new NhaTruong();
    while (true){
      //Thêm lựa chọn
      System.out.println("Nhập lựa chọn ");
      System.out.println("Nhập 1 để thêm học sinh ");
      System.out.println("Nhập 2 để hiện các học sinh 20 tuổi");
      System.out.println("Nhập 3 để cho biết số lượng học sinh 23 tuổi quê ĐN");
      System.out.println("Nhập 4 để hiển thị tất cả");
      System.out.println("Nhập 5 để thoát chương trình");
      int luaChon;
      try {
        System.out.println("Nhập lựa chọn: ");
        luaChon=Integer.parseInt(sc.nextLine());
      }
      catch (NumberFormatException e)
      {
        System.out.println("Nhập số nguyên ");
        continue;
      }
      switch (luaChon)
      {
        case 1:
        {
          System.out.println("Nhập họ và tên:");
          String name=sc.nextLine();
          System.out.println("Nhập tuổi: ");
          int age=sc.nextInt();
          sc.nextLine();
          System.out.println("Nhập quê quán: ");
          String address=sc.nextLine();
          System.out.println("Nhập tên lớp: ");
          String className=sc.nextLine();
          HocSinh HS=new HocSinh(name,age,address,className);
          school.ThemHocSinh(HS);
          break;
        }
        case 2:
        {
          System.out.println("Danh sách sinh viên 20 tuổi là: ");
          school.SinhVien20Tuoi();
          break;
        }
        case 3:
        {
          System.out.println("Danh sách học sinh 23 tuổi và quê ĐN");
          school.Tuoi23oDaNang();
          break;
        }
        case 4:
        {
          System.out.println("Danh sách tất cả sinh viên là: ");
          school.SapXepDanhSach();
          school.HienThiHocSinh();
          break;
        }
        default:
        {
          System.out.println("Lựa chọn không hợp lệ: ");
          break;
        }
      }
    }
  }
}
