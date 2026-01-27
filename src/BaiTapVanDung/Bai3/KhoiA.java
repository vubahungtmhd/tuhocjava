package BaiTapVanDung.Bai3;

public class KhoiA extends QuanLyThiSinh{
  public static final String monToan="Toan";
  public static final String monHoa="Hoa";
  public static final String monLy="Ly";
  public KhoiA(int soBaoDanh, String hoTen, String diaChi, String mucUuTien) {
    super(soBaoDanh, hoTen, diaChi, mucUuTien);
  }

  @Override
  public String toString() {
    return super.toString()+" Môn học: "+monToan+"-"+monLy+"-"+monHoa;
  }
}
