package TinhDaHinh;public class TruongPhong extends NhanSu{

  @Override
  public double tinhLuong(int ngayCong) {
    return 50*ngayCong;//Trưởng phòng lương 50$
  }

  public TruongPhong(String ten, String cccd, String queQuan) {
    super(ten, cccd, queQuan);
  }

  public TruongPhong(String ten, String cccd) {
    super(ten, cccd);
  }

  public TruongPhong() {
  }
}
