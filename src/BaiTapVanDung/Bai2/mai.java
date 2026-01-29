package BaiTapVanDung.Bai2;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Scanner;

public class mai {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    HashMap<String,TaiLieu> danhSachTaiLieu=new HashMap<>();
    while (true)
    {
      System.out.println("============================Nhập lựa chọn: ============================");
      System.out.println("1. để thêm tài liệu. ");
      System.out.println("2. để xóa tài liệu theo mã. ");
      System.out.println("3. để hiển thị tài liệu. ");
      System.out.println("4. để tìm kiếm theo loại: Sách, tạp chí, báo ");
      System.out.println("5. để thoát chương trình");
      int luachon=sc.nextInt();
      sc.nextLine();

      switch (luachon)
      {

        case 1:
        {
          System.out.println("----------------------------Nhập loại tài liệu-------------------------");
          System.out.println("Nhập a: để thêm sách");
          System.out.println("Nhập b: để thêm tạp chí");
          System.out.println("Nhập c: để thêm báo");
          String loaiTaiLieu=sc.nextLine();
          System.out.println("Nhập mã tài liệu");
          String maTl=sc.nextLine();
          if(danhSachTaiLieu.containsKey(maTl))
          {
            System.out.println("Mã tài liệu đã tồn tại, vui lòng nhập lại");
            break;
          }
          else
          {
            System.out.println("Nhập tên nhà xuất bản");
            String nxb = sc.nextLine();
            System.out.println("Nhập số bản phát hành");
            int sL = sc.nextInt();
            sc.nextLine();
            switch (loaiTaiLieu) {
              case "a": {
                System.out.println("Nhập tên tác giả: ");
                String tacgia = sc.nextLine();
                System.out.println("Nhập số trang: ");
                int sotrang = sc.nextInt();
                sc.nextLine();
                TaiLieu themSach = new Sach(maTl, nxb, sL, tacgia, sotrang);
                danhSachTaiLieu.put(maTl, themSach);
                break;
              }
              case "c":
              {
                System.out.println("Nhập ngày phát hành");
                int day=sc.nextInt();
                sc.nextLine();
                TaiLieu themBao=new Bao(maTl,nxb,sL,day);
                danhSachTaiLieu.put(maTl,themBao);
                break;
              }
              case "b": {
                System.out.println("Nhập số phát hành: ");
                int sph= sc.nextInt();
                sc.nextLine();
                System.out.println("Nhập tháng phát hành: ");
                int month=sc.nextInt();
                sc.nextLine();
                TaiLieu themTapChi=new TapChi(maTl,nxb,sL,sph,month);
                danhSachTaiLieu.put(maTl,themTapChi);
                break;
              }
              default: {
                System.out.println("Lựa chọn không hợp lệ: ");
                break;
              }
            }
          }
            break;
          }
        case 2:
        {
          System.out.println("Nhập mã tài liệu cần xóa: ");
          String maKiemTra=sc.nextLine();
          if(danhSachTaiLieu.containsKey(maKiemTra))
          {
            danhSachTaiLieu.remove(maKiemTra);
            System.out.println("Đã xóa tài liệu có mã là: "+ maKiemTra);
          }
          else
          {
            System.out.println("Không tìm thấy mã tài liệu");
          }
          break;
        }
        case 3:
        {
          System.out.println("=====================Hiển thị các sản phẩm=========================");
          for(TaiLieu tl: danhSachTaiLieu.values())
          {
            System.out.println(tl);
          }
          break;
        }
        case 4:
        {
          System.out.println("----------------------------Nhập loại tài liệu cần tìm kiếm--------------------------------");
          System.out.println("Nhập a: để tìm sách");
          System.out.println("Nhập b: để tìm tạp chí");
          System.out.println("Nhập c: để tìm báo");
          String loaiTaiLieuCanTim=sc.nextLine();
          switch (loaiTaiLieuCanTim)
          {
            case "a":
            {
              System.out.println("Danh sách Sách: ");
              for(TaiLieu tl:danhSachTaiLieu.values())
              {
                if(tl instanceof Sach)
                {
                  System.out.println(tl);
                }
              }break;
            }
            case "b":
            {
              System.out.println("Danh sách tạp chí: ");
              for(TaiLieu tl:danhSachTaiLieu.values())
              {
                if(tl instanceof TapChi)
                {
                  System.out.println(tl);
                }
              }
              break;
            }
            case "c":
            {
              System.out.println("Danh sách báo: ");
              for(TaiLieu tl:danhSachTaiLieu.values())
              {
                if(tl instanceof Bao)
                {
                  System.out.println(tl);
                }
              }
              break;
            }
            default:
            {
              System.out.println("Loại tài liệu "+loaiTaiLieuCanTim+" Không có sẵn: ");
              break;
            }
          }
          break;
        }
        case 5:
        {
          System.out.println("Thoát Chương Trình");
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
