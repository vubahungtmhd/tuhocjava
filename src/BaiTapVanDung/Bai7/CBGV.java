package BaiTapVanDung.Bai7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CBGV {
  List<Nguoi> danhSachGv;
  public CBGV() {
    this.danhSachGv = new ArrayList<>();
  }

  public void ThemGiaoVien(Nguoi ng1)
  {
    this.danhSachGv.add(ng1);
  }
  public void HienThiGiaoVien()
  {
    System.out.println("Danh sách giáo viên");
    System.out.printf("%-10s | %-20s | %-5s | %-15s  | %-15s | %-15s |%-15s | %-15s%n",
            "Mã Số", "Họ Tên", "Tuổi", "Quê Quán","Lương Cứng","Lương Thưởng","Tiền phạt", "Lương Thực Lĩnh");
    for(Nguoi nguoi: danhSachGv)
    {
      System.out.printf("%-10s | %-20s | %-5s | %-15s | %-15.2f | %-15.2f | %-15.2f | %-15.2f %n",
              nguoi.getMaSo(),
              nguoi.getHoTen(),
              nguoi.getTuoi(),
              nguoi.getQueQuan(),
              nguoi.getLuongCung(),
              nguoi.getLuongThuong(),
              nguoi.getTienPhat(),
              nguoi.LuongThucLinh());
    }
  }
  public void XoaGiaoVien(String maGv)
  {
    Iterator<Nguoi> it=danhSachGv.iterator();
    boolean check=false;
    while(it.hasNext())
    {
      Nguoi gv=it.next();
      if(gv.getMaSo().equalsIgnoreCase(maGv))
      {
        it.remove();
        check=true;
        System.out.println("Đã xóa giáo viên");
        break;
      }
    }
    if(!check)
      System.out.println("Không tìm thấy giáo viên có mã "+maGv);
  }
  public boolean CheckMaGv(String mgv)
  {
    for(Nguoi a:danhSachGv)
    {
      if(a.getMaSo().equalsIgnoreCase(mgv))
        return true;
    }
    return false;
  }


}
