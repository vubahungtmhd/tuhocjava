package BaiTapVanDung.Bai2;

import org.w3c.dom.ls.LSOutput;

public class TaiLieu {
  private String maTaiLieu;
  private String tenNXB;
  private int soBanPhatHanh;

  public TaiLieu(String maTaiLieu, String tenNXB, int soBanPhatHanh) {
    this.maTaiLieu = maTaiLieu;
    this.tenNXB = tenNXB;
    this.soBanPhatHanh = soBanPhatHanh;
  }

  public void setMaTaiLieu(String maTaiLieu) {
    this.maTaiLieu = maTaiLieu;
  }

  public void setTenNXB(String tenNXB) {
    this.tenNXB = tenNXB;
  }

  public void setSoBanPhatHanh(int soBanPhatHanh) {
    this.soBanPhatHanh = soBanPhatHanh;
  }

  public String getMaTaiLieu() {
    return maTaiLieu;
  }

  @Override
  public String toString() {
    return "Mã tài liệu: "+maTaiLieu+" Nhà xuất bản: "+tenNXB+" Số bản: "+soBanPhatHanh;
  }
}
