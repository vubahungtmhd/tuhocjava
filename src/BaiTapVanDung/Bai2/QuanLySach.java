package BaiTapVanDung.Bai2;

import java.util.HashMap;

public class QuanLySach {
  private HashMap<String, TaiLieu> dachSachTaiLieu=new HashMap<>();
  public void themTaiLieu(TaiLieu tl)
  {
    dachSachTaiLieu.put(tl.getMaTaiLieu(),tl);
    System.out.println("Thêm tài liệu thành công");

  }
}
