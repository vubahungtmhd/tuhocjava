package BaiTapVanDung.Bai2;

public class TapChi extends TaiLieu {
  private int soPhatHanh;
  private  int thangPhatHanh;

  public TapChi(String maTaiLieu, String tenNXB, int soBanPhatHanh,int soPhatHanh,int thangPhatHanh) {
    super(maTaiLieu, tenNXB, soBanPhatHanh);
    this.soPhatHanh=soPhatHanh;
    this.thangPhatHanh=thangPhatHanh;
  }

  public void setSoPhatHanh(int soPhatHanh) {
    this.soPhatHanh = soPhatHanh;
  }

  public void setThangPhatHanh(int thangPhatHanh) {
    this.thangPhatHanh = thangPhatHanh;
  }

  @Override
  public String toString() {
    return super.toString()+ " So phat hanh: " + soPhatHanh + " Tháng phát hành: " + thangPhatHanh;
  }
}
