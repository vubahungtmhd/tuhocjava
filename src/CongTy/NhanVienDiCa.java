package CongTy;

public class NhanVienDiCa extends NhanVien {
  //Khai báo thêm thuộc tính ca
  protected int ca;
  public NhanVienDiCa(String ten, String que, int cccd) {
    super(ten, que, cccd);
  }
  public NhanVienDiCa(String ten, String que, int cccd, int ca) {
    super(ten, que, cccd);
    this.ca=ca;
  }
  @Override
  public double tinhLuong() {
    return luongCoBan*1.05;// Cao hơn 5%
  }
}
