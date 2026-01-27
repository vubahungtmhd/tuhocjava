package BaiTapVanDung.Bai3;

public class KhoiB extends QuanLyThiSinh{
  public static final String monToan="Toan";
  public static final String monHoa="Hoa";
  public static final String monSinh="Sinh";
  public KhoiB(int soBaoDanh, String hoTen, String diaChi, String mucUuTien) {
    super(soBaoDanh, hoTen, diaChi, mucUuTien);
  }

  @Override
  public String toString() {
    return super.toString()+" Môn học: "+monToan+"-"+monHoa+"-"+monSinh;
  }
}
