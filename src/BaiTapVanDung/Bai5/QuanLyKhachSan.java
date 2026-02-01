package BaiTapVanDung.Bai5;

import java.util.ArrayList;
import java.util.List;

public class QuanLyKhachSan {
  private List<Nguoi> danhSachNguoi;

  public QuanLyKhachSan() {
    danhSachNguoi = new ArrayList<>();
  }
  public void themThongTinPhong(Nguoi nguoi)
  {
    danhSachNguoi.add(nguoi);
  }
  public void hienThiTongTin()
  {
    System.out.println("Danh sách người thuê phòng");
    for(Nguoi x:danhSachNguoi)
    {
      System.out.println(x);
    }
  }
  //List k cho phép xóa phần tử khi đang duyệt List
  public void xoaTheoCMT(String CMT)
  {
    danhSachNguoi.removeIf(nguoi -> nguoi.getSoCMT().equals(CMT));
    System.out.println("Xóa khách hàng có số CMT: "+CMT+" thành công");
  }
  public int TinhTien(String CMT)
  {
    for (Nguoi x:danhSachNguoi)
    {
      if(x.getSoCMT().equals(CMT))
        return x.getSoNgayThue()*x.getPhong().getGiaThue();

    }
    return 0;
  }


  public boolean checkCMT(String cccd)
  {
    for(Nguoi x:danhSachNguoi)
    {
      if(x.getSoCMT().equals(cccd))
      {
        return true;
      }
    }
    return false;
  }

}
