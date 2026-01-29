package BaiTapVanDung.Bai2;

public class Sach extends TaiLieu {
  private String tenTacGia;
  private int soTrang;

  public void setTenTacGia(String tenTacGia) {
    this.tenTacGia = tenTacGia;
  }

  public void setSoTrang(int soTrang) {
    this.soTrang = soTrang;
  }

  @Override
  public String toString() {
    return super.toString()+ " Tác giả: " + tenTacGia + " Số trang: " + soTrang ;
  }

  public Sach(String maTaiLieu, String tenNXB, int soBanPhatHanh, String tenTacGia, int soTrang) {
    super(maTaiLieu, tenNXB, soBanPhatHanh);
    this.tenTacGia=tenTacGia;
    this.soTrang=soTrang;

  }
}
