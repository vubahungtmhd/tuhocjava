package BaiTapVanDung.Bai4;

import java.util.ArrayList;
import java.util.List;

public class KhuPho {
  private List<HoGiaDinh> danhSachHo;

  public KhuPho(List<HoGiaDinh> danhSachHo) {
    this.danhSachHo = new ArrayList<>();
  }
  public void themCacHo(HoGiaDinh hgd)
  {
    this.danhSachHo.add(hgd);
  }
  public void thongTinKhuPho()
  {
    for(HoGiaDinh ho:danhSachHo)
    {
      ho.thongTinHoGiaDinh();
    }
  }
  public boolean KiemTraCMT(String cmt)
  {
    for(HoGiaDinh x: danhSachHo){
      for(Nguoi ng:x.getDanhSachThanhVien())
      {
        if(cmt.equals(ng.getSoCMT()))
          return true;
      }
    }
      return false;
  }


}
