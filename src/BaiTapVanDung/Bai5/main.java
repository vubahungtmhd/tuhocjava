package BaiTapVanDung.Bai5;

import java.util.List;
import java.util.Scanner;

public class main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    QuanLyKhachSan QLKS=new QuanLyKhachSan();
    while(true)
    {
      System.out.println("Nhập lựa chọn");
      System.out.println("Chọn 1 để thêm thông tin khách");
      System.out.println("Chọn 2 hiển thị danh sách khách hàng");
      System.out.println("Chọn 3 để xóa thông tin khách theo số CMT");
      System.out.println("Chọn 4 để tình tiền thuê phòng");
      System.out.println("Chọn 5 để thoát chương trình");
      int luachon=sc.nextInt();
      sc.nextLine();
      switch (luachon)
      {
        case 1:{
          System.out.println("Nhập tên khách hàng: ");
          String name=sc.nextLine();
          System.out.println("Nhập tuổi khách hàng: ");
          int age=sc.nextInt();
          sc.nextLine();

          String cmt;
          while(true) {
            System.out.println("Nhập số CMT khách hàng: ");
            cmt = sc.nextLine();
            boolean check = QLKS.checkCMT(cmt);
            if (check) {
              System.out.println("Số CMT ĐÃ TỒN TẠI, VUI LÒNG NHẬP LẠI");
            } else {
              System.out.println("Nhập số CMT thành công");
              break;
            }
          }






          System.out.println("Nhập số ngày thuê: ");
          int day=sc.nextInt();
          sc.nextLine();
          System.out.println("Lựa chọn phòng");
          String loai=sc.nextLine();
          Phong p=null;
          switch (loai.toLowerCase())
          {
            case "a":
            {
              p=new LoaiA();
              break;
            }
            case "b":
            {
              p=new LoaiB();
              break;
            }
            case "c":
            {
              p=new LoaiC();
              break;
            }
            default:
            {
              System.out.println("Loại phòng: "+loai+" không tồn tại");
              break;
            }
          }
          if(p!=null){
          Nguoi thongTinKhach =new Nguoi(name,age,cmt,p,day);
          QLKS.themThongTinPhong(thongTinKhach);
          }
          break;
        }
        case 2:{
          QLKS.hienThiTongTin();
          break;
        }
        case 3:{
          System.out.println("Nhập số CMT cần xóa: ");
          String cmt1=sc.nextLine();
          QLKS.xoaTheoCMT(cmt1);
          break;
        }
        case 4:
        {
          System.out.println("Nhập số CMT: ");
          String cmt=sc.nextLine();
          if(QLKS.checkCMT(cmt))
            System.out.println("Số tiền khách phải trả là: "+QLKS.TinhTien(cmt));
          else
            System.out.println("Số CMT KHÔNG TỒN TẠI");
          break;
        }
        case 5:{
          System.out.println("Thoát chương trình");
          return;
        }
        default:
        {
          System.out.println("Lựa chọn không phù hợp");
          break;
        }

      }


    }

  }
}
