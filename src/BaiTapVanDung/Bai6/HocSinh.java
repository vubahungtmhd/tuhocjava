package BaiTapVanDung.Bai6;

public class HocSinh {
  private String hoTen;
  private int tuoi;
  private String queQuan;
  private String tenLop;
  //Setter
  public void setHoTen(String hoTen) {
    this.hoTen = hoTen;
  }

  public void setTuoi(int tuoi) {
    this.tuoi = tuoi;
  }

  public void setQueQuan(String queQuan) {
    this.queQuan = queQuan;
  }

  public void setTenLop(String tenLop) {
    this.tenLop = tenLop;
  }

  //Getter
  public int getTuoi() {
    return tuoi;
  }

  public String getQueQuan() {
    return queQuan;
  }

  public String getHoTen() {
    return hoTen;
  }
  //toString

  public HocSinh(String hoTen, int tuoi, String queQuan, String tenLop) {
    this.hoTen = hoTen;
    this.tuoi = tuoi;
    this.queQuan = queQuan;
    this.tenLop = tenLop;
  }

  @Override
  public String toString() {
    return "Họ Tên: "+hoTen+" Tuổi: "+tuoi+" Quê Quán: "+queQuan+"Tên Lớp: ";
  }
}
