package QuanLyDiem;

public class KhoaToan extends NamHoc2023 {

  public KhoaToan(String ten, String cccd) {
    super(ten, cccd);
  }
  //Overide

  @Override
  public void tinhDiem() {
    System.out.println("Đây là phương thức tính điểm của khoa toán");
  }
}
