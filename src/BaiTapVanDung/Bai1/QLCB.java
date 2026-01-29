package BaiTapVanDung.Bai1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class QLCB {
  private List<CanBo> canBo;

  public QLCB() {
    this.canBo = new ArrayList<>();
  }
  public void them_canbo(CanBo cb)
  {
    this.canBo.add(cb);
  }
  public List<CanBo> TimKiemTheoTen(String name)
  {
    List<CanBo> ketQua= new ArrayList<>();
    for(CanBo canBoCanTim: this.canBo)
    {
      if(canBoCanTim.getHoTen().toLowerCase().contains(name.toLowerCase()))
      {
        ketQua.add(canBoCanTim);
      }
    }
    return ketQua;
  }
  public void HienThiTheoTen()
  {
    for(CanBo cbx: canBo)
    {
      System.out.println(cbx.toString());
    }
  }

}
