package BaiTapVanDung.Bai1;

import java.util.List;
import java.util.Scanner;

public class main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    QLCB qlcb=new QLCB();
    while(true)
    {
      System.out.println("Nhập lựa chọn: ");
      String luachon=sc.nextLine();
      switch (luachon)
      {
        case "1":
        {
          System.out.println("Nhap a: để thêm công nhân");
          System.out.println("Nhap b: để thêm kĩ sư");
          System.out.println("Nhap c: để thêm nhân viên");
          String loaiCanBo=sc.nextLine();
          //Nhập các thông tin chung
          System.out.println("Nhập tên cán bộ: ");
          String name=sc.nextLine();
          System.out.println("Nhập tuổi của cán bộ: ");
          int age=sc.nextInt();
          sc.nextLine();
          System.out.println("Nhập giới tính: ");
          String gender =sc.nextLine();
          System.out.println("Nhập địa chỉ: ");
          String address=sc.nextLine();
          switch (loaiCanBo)
          {
            case "a":
            {
              System.out.println("Nhập bậc: ");
              int  level=sc.nextInt();
              sc.nextLine();
              CanBo congNhan=new CongNhan(name,age,gender,address,level);
              qlcb.them_canbo(congNhan);
              break;
            }
            case "b":
            {
              System.out.println("Nhập ngành đào tạo");
              String branch=sc.nextLine();
              CanBo kiSu=new KiSu(name,age,gender,address,branch);
              qlcb.them_canbo(kiSu);
              break;
            }
            case "c":
            {
              System.out.println("Nhập công việc");
              String congViec=sc.nextLine();
              CanBo nhanVien=new NhanVien(name,age,gender,address,congViec);
              qlcb.them_canbo(nhanVien);
              break;
            }
            default: {
              System.out.println("Không hợp lệ");
              break;
            }
          }
          break;
        }
        case "2":
        {
          System.out.println("Nhập tên cán bộ cần tìm: ");
          String tenCb=sc.nextLine();
          List<CanBo> canBoTimDuoc =qlcb.TimKiemTheoTen(tenCb);
          if(canBoTimDuoc.isEmpty())
          {
            System.out.println("Không tìm thấy cán bộ "+tenCb);
          }
          else
          {
            System.out.println("Tìm thấy cán bộ");
          }
          break;
        }
        case "3": {
          System.out.println("Thoat chuong trình");
          return;
        }
        default:
        {
          System.out.println("Lựa chọn không hợp lệ");
          break;
        }

      }
    }
  }
}
