package BaiTapVanDung.Bai7;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Quản lý Cán Bộ Giáo Viên");
    CBGV cbgv=new CBGV();
    while(true)
    {
      System.out.println("Nhập lựa chọn: ");
      System.out.println("Nhập 1 để thêm giáo viên");
      System.out.println("Nhập 2 tính và in ra lương của giáo viên");
      System.out.println("Nhập 3 để xóa giáo viên");
      int n=sc.nextInt();
      sc.nextLine();

      switch(n)
      {
        case 1:
        {
          String ms;
          System.out.println("Nhập mã số giáo viên");
          ms=sc.nextLine();
          while(cbgv.CheckMaGv(ms))
          {
            System.out.println("Mã Gv đã tồn tại vui lòng nhập lại");
            System.out.println("Nhập mã số giáo viên");
            ms=sc.nextLine();

          }
          System.out.println("Nhập lương cứng");
          float lc=sc.nextFloat();
          sc.nextLine();
          System.out.println("Nhập lương thưởng");
          float lt=sc.nextFloat();
          sc.nextLine();
          System.out.println("Nhập tiền phạt");
          float tp=sc.nextFloat();
          sc.nextLine();
          System.out.println("Nhập họ tên");
          String ten=sc.nextLine();
          System.out.println("Nhập tuổi");
          int t=sc.nextInt();
          sc.nextLine();
          System.out.println("Nhập Quê Quán");
          String qq=sc.nextLine();

          Nguoi gv=new Nguoi(lc,lt,tp,ten,t,qq,ms);
          cbgv.ThemGiaoVien(gv);
          break;
        }
        case 2:
        {
          System.out.println("Danh sách giáo viên");
          cbgv.HienThiGiaoVien();
          break;
        }
        case 3:
        {
          System.out.println("Nhập mã Giáo Viên cần xóa");
          String GVCanXoa=sc.nextLine();
          cbgv.XoaGiaoVien(GVCanXoa);
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
