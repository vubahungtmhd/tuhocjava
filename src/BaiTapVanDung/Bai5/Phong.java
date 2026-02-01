package BaiTapVanDung.Bai5;

public abstract class Phong {
  protected int giaThue;
  protected String loaiPhong;

  public Phong(int giaThue, String loaiPhong) {
    this.giaThue = giaThue;
    this.loaiPhong = loaiPhong;
  }

  public int getGiaThue() {
    return giaThue;
  }
}
