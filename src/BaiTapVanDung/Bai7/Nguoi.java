package BaiTapVanDung.Bai7;

public class Nguoi {
  private float luongCung;
  private float luongThuong;
  private float tienPhat;
  private String hoTen;
  private int tuoi;
  private String queQuan;
  private String maSo;
  //Phương thức khởi tạo

  public Nguoi(float luongCung, float luongThuong, float tienPhat, String hoTen, int tuoi, String queQuan, String maSo) {
    this.luongCung = luongCung;
    this.luongThuong = luongThuong;
    this.tienPhat = tienPhat;
    this.hoTen = hoTen;
    this.tuoi = tuoi;
    this.queQuan = queQuan;
    this.maSo = maSo;
  }
  //Phương thức set

  public void setLuongCung(float luongCung) {
    this.luongCung = luongCung;
  }

  public void setLuongThuong(float luongThuong) {
    this.luongThuong = luongThuong;
  }

  public void setTienPhat(float tienPhat) {
    this.tienPhat = tienPhat;
  }

  public float LuongThucLinh() {
    return getLuongCung()+getLuongThuong()-getTienPhat();
  }

  public void setHoTen(String hoTen) {
    this.hoTen = hoTen;
  }

  public void setTuoi(int tuoi) {
    this.tuoi = tuoi;
  }

  public void setQueQuan(String queQuan) {
    this.queQuan = queQuan;
  }

  public void setMaSo(String maSo) {
    this.maSo = maSo;
  }
  //Phương thức get

  public float getLuongCung() {
    return luongCung;
  }

  public float getLuongThuong() {
    return luongThuong;
  }

  public float getTienPhat() {
    return tienPhat;
  }
  public String getHoTen() {
    return hoTen;
  }

  public int getTuoi() {
    return tuoi;
  }

  public String getQueQuan() {
    return queQuan;
  }

  public String getMaSo() {
    return maSo;
  }
  //toString

  @Override
  public String toString() {
    return "Họ Tên: " + hoTen + '\'' +
            "Tuổi: " + tuoi +
            "Quê quán:" + queQuan + '\'' +
            "Mã Số:" + maSo + '\'' +
            "Lương Cứng: " + luongCung +
            "Lương Thưởng: " + luongThuong +
            "Tiền phạt: "+ tienPhat
            +"Lương thực lĩnh: "+LuongThucLinh();
    //(luongCung+luongThuong-tienPhat)
  }
}
