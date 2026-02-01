package TinhDaHinh;

public class PhoPhong extends NhanSu{

  @Override
  public double tinhLuong(int ngayCong) {
    return 40*ngayCong;//Phó phòng lương 50$
  }

  public PhoPhong(String ten, String cccd, String queQuan) {
    super(ten, cccd, queQuan);
  }

  public PhoPhong(String ten, String cccd) {
    super(ten, cccd);
  }

  public PhoPhong() {
  }
}
