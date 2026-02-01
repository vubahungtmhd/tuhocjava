package QuanLyDiem;

public class KhoaVan extends NamHoc2023{
  public KhoaVan(String ten, String cccd) {
    super(ten, cccd);
  }

  @Override
  public void tinhDiem() {
    System.out.println("Phương thức tính điểm của khoa văn");
  }
}
