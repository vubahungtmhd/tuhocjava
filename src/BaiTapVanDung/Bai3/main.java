package BaiTapVanDung.Bai3;

import java.util.Scanner;

public class main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    TuyenSinh ts=new TuyenSinh();
    while (true)
    {
      System.out.println("======================Nhập lựa chọn để thực hiện======================");
      System.out.println("Chọn 1 để thêm mới thí sinh");
      System.out.println("Chọn 2 để Hiển thị thí sinh");
      System.out.println("Chọn 3 để tìm kiếm theo số báo danh");
      System.out.println("Chọn 4 để thoát chương trình");
      int select=sc.nextByte();
      switch (select)
      {
        case 1:
        {
          System.out.println("Nhập số báo danh");
          int sbd=sc.nextInt();
          sc.nextLine();
          System.out.println("Nhập ho ten: ");
          String name=sc.nextLine();
          System.out.println("Nhập địa chỉ");
          String address=sc.nextLine();
          System.out.println("Nhập mức ưu tiên");
          String muc=sc.nextLine();
          System.out.println("Nhập lựa chọn khối");
          String khoi=sc.nextLine();
          switch (khoi)
          {
            case "a":
            {
              KhoiA a1=new KhoiA(sbd,name,address,muc);
              ts.themThiSInh(a1);
              break;
            }
            case "b":
            {
              KhoiB b1=new KhoiB(sbd,name,address,muc);
              ts.themThiSInh(b1);
              break;
            }
            case "c":
            {
              KhoiC c1=new KhoiC(sbd,name,address,muc);
              ts.themThiSInh(c1);
              break;
            }
            default:
            {
              System.out.println("Không tồn tại khối "+khoi);
              break;
            }
          }
          break;
        }
        case 2:
        {
          System.out.println("Hiển thị thông tin thí sinh");
          ts.hienThiThongTin();
          break;
        }
        case 3:
        {
          break;
        }
        case 4:
        {
          break;
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
