package BaiTapVanDung.Bai3;

public class KhoiC extends QuanLyThiSinh{
  public static final String monVan="Van";
  public static final String monSu="Su";
  public static final String monDia="Dia";
  public KhoiC(int soBaoDanh, String hoTen, String diaChi, String mucUuTien) {
    super(soBaoDanh, hoTen, diaChi, mucUuTien);
  }

  @Override
  public String toString() {
    return super.toString()+" Môn học: "+monVan+"-"+monSu+"-"+monDia;
  }
}
