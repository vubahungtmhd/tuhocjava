package BaiTapVanDung.Bai4;

public class Nguoi {
  private String hoTen;
  private int tuoi;
  private String ngheNghiep;
  private String soCMT;

  public Nguoi(String hoTen, int tuoi, String ngheNghiep, String soCMT) {
    this.hoTen = hoTen;
    this.tuoi = tuoi;
    this.ngheNghiep = ngheNghiep;
    this.soCMT = soCMT;
  }

  public String getSoCMT() {
    return soCMT;
  }

  public void setHoTen(String hoTen) {
    this.hoTen = hoTen;
  }

  public void setTuoi(int tuoi) {
    this.tuoi = tuoi;
  }

  public void setNgheNghiep(String ngheNghiep) {
    this.ngheNghiep = ngheNghiep;
  }

  public void setSoCMT(String soCMT) {
    this.soCMT = soCMT;
  }

  @Override
  public String toString() {
    return "Họ Tên: "+hoTen+" Tuổi: "+tuoi+" Nghề Nghiệp: "+ngheNghiep+" Số CCCD: "+soCMT;
  }
}
