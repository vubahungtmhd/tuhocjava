package TestInterface;

public interface ViDuInterface {
  //Tập các thuộc tính chỉ cho phép là hằng số
  static final double phuCap=15;
  //Các phương thúc phải là trừu tượng (abstract)
  public abstract void thongTin(String ten,String cccd, int namSinh);
  public abstract double tinhLuong(double luongNgay, int soNgayCong);

}
