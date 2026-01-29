package BaiTapVanDung.Bai1;

public class KiSu extends CanBo {
  private String nganh;

  public KiSu(String hoTen, int tuoi, String gioiTinh, String diaChi,String nganh) {
    super(hoTen, tuoi, gioiTinh, diaChi);
    this.nganh=nganh;
  }

  public void setNganh(String nganh) {
    this.nganh = nganh;
  }

  @Override
  public String toString() {
    return  super.toString()+", Ngành: "+nganh;
  }
}
