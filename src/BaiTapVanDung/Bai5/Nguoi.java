package BaiTapVanDung.Bai5;

public class Nguoi {
  private String hoTen;
  private int tuoi;
  private String soCMT;
  private Phong phong;
  private int soNgayThue;

  public Nguoi(String hoTen, int tuoi, String soCMT, Phong phong, int soNgayThue) {
    this.hoTen = hoTen;
    this.tuoi = tuoi;
    this.soCMT = soCMT;
    this.phong = phong;
    this.soNgayThue = soNgayThue;
  }

  public void setHoTen(String hoTen) {
    this.hoTen = hoTen;
  }

  public void setTuoi(int tuoi) {
    this.tuoi = tuoi;
  }

  public void setSoCMT(String soCMT) {
    this.soCMT = soCMT;
  }

  public void setPhong(Phong phong) {
    this.phong = phong;
  }

  public void setSoNgayThue(int soNgayThue) {
    this.soNgayThue = soNgayThue;
  }

  public String getHoTen() {
    return hoTen;
  }

  public int getTuoi() {
    return tuoi;
  }

  public String getSoCMT() {
    return soCMT;
  }

  public Phong getPhong() {
    return phong;
  }

  public int getSoNgayThue() {
    return soNgayThue;
  }

  @Override
  public String toString() {
    return "Họ tên: "+ hoTen + " Tuổi: " + tuoi + " Số CMT:" + soCMT + " Phòng" + phong +
            " Số ngày thuê: " + soNgayThue;
  }
}
