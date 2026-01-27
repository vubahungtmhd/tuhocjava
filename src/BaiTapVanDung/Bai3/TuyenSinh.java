package BaiTapVanDung.Bai3;

import java.util.ArrayList;
import java.util.List;

public class TuyenSinh {
  private List<QuanLyThiSinh> danhSach;
  public TuyenSinh() {
    this.danhSach = new ArrayList<>();
  }
  public void themThiSInh(QuanLyThiSinh x)
  {
    this.danhSach.add(x);
  }
  public void hienThiThongTin()
  {
    for(QuanLyThiSinh x: danhSach)
    {
      System.out.println(x);
    }
  }

}
