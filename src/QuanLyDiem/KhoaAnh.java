package QuanLyDiem;

public class KhoaAnh extends NamHoc2023{
  public KhoaAnh(String ten, String cccd) {
    super(ten, cccd);
  }

  @Override
  public void tinhDiem() {
    System.out.println("Phương thức tính điểm của khoa Anh");
  }
}
