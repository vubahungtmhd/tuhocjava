package TinhDaHinh;

public abstract class NhanSu {
  //Thêm các thuộc tính
  private String ten;
  private String cccd;
  private String queQuan;

  public NhanSu(String ten, String cccd, String queQuan) {
    this.ten = ten;
    this.cccd = cccd;
    this.queQuan = queQuan;
  }

  public NhanSu(String ten, String cccd) {
    this.ten = ten;
    this.cccd = cccd;
  }

  public NhanSu() {
  }

  //Phương thức tính lương
  public abstract double tinhLuong(int ngayCong);

  public String getTen() {
    return ten;
  }

  public String getCccd() {
    return cccd;
  }

  public String getQueQuan() {
    return queQuan;
  }
}
