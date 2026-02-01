package CongTy;

public class NhanvienHanhChinh extends NhanVien{
  public NhanvienHanhChinh(String ten, String que, int cccd) {
    super(ten, que, cccd);
  }

  @Override
  public double tinhLuong() {
    return luongCoBan;
  }
}
