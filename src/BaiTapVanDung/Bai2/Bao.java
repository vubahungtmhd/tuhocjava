package BaiTapVanDung.Bai2;

public class Bao extends TaiLieu {
  private  int ngayPhatHanh;

  public Bao(String maTaiLieu, String tenNXB, int soBanPhatHanh,int ngayPhatHanh) {
    super(maTaiLieu, tenNXB, soBanPhatHanh);
    this.ngayPhatHanh=ngayPhatHanh;
  }

  public void setNgayPhatHanh(int ngayPhatHanh) {
    this.ngayPhatHanh = ngayPhatHanh;
  }

  @Override
  public String toString() {
    return super.toString()+ " Ngày phát hành: "+ngayPhatHanh;
  }
}
