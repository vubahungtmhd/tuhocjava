package BaiTapVanDung.Bai3;

public class QuanLyThiSinh {
  private int soBaoDanh;
  private String hoTen;
  private String diaChi;
  private String mucUuTien;

  public QuanLyThiSinh(int soBaoDanh, String hoTen, String diaChi, String mucUuTien) {
    this.soBaoDanh = soBaoDanh;
    this.hoTen = hoTen;
    this.diaChi = diaChi;
    this.mucUuTien = mucUuTien;
  }

  public void setSoBaoDanh(int soBaoDanh) {
    this.soBaoDanh = soBaoDanh;
  }

  public void setHoTen(String hoTen) {
    this.hoTen = hoTen;
  }

  public void setDiaChi(String diaChi) {
    this.diaChi = diaChi;
  }

  public void setMucUuTien(String mucUuTien) {
    this.mucUuTien = mucUuTien;
  }

  public int getSoBaoDanh() {
    return soBaoDanh;
  }

  @Override
  public String toString() {
    return "Số báo danh: "+soBaoDanh+" Họ tên: "+hoTen+" Địa chỉ: "+diaChi+" Mức ưu tiên: "+mucUuTien;
  }
}
