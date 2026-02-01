package TruongDH.LyThuyet;

public class SinhVien {
  //Thuộc tính
  protected String hoTen;
  protected double diem;
  //Phương thức
  //Phương thức không có kiểu trả về
  //Constructor mặc định
 /* public SinhVien()
  {
    hoTen="Trần Hòa";
    diem=10.0;
  }*/
  //alt+insert+fn se ra nhanh chong
  public SinhVien() {
    hoTen="Thu Hang";//biến cục bộ
    diem=0;
  }
  //Constuctor có đối

  public SinhVien(String hoTen) {
    //this.hoTen = hoTen;//Biến toàn phần trùng với biến cục bộ
    //this.hoTen ám chỉ là biến toàn phần
    this.hoTen=hoTen;

  }

  public SinhVien(String hoTen, double diem) {
    this.hoTen = hoTen;
    this.diem = diem;
  }

  //Phương thức không có kieu trả về
  public void hienthithongtin()
  {
    System.out.println(hoTen+" "+diem);
  }
  //Get va set
  //alt+fn+insert -> getter
 //Phương thức có kiểu trả về
  public double tinhDtb(double diemToan, double diemVan)
  {
    return (diemToan+diemVan)/2;
  }
 //Overloading khác về số lượng đối số
  public double tinhDtb(double diemToan, double diemVan,double diemAnh)
  {
    return (diemToan+diemVan+diemAnh)/3;
  }
  //khác nhau về kieu Dl
  public double tinhDtb(double diemToan, double diemVan, String abc)
  {
    return (diemToan+diemVan)/2;
  }
  public double tinhDtb(String abc, double diemToan, double diemVan)
  {
    return (diemToan+diemVan)/2;
  }
  public String getHoTen() {
    return hoTen;
  }

  public double getDiem() {
    return diem;
  }

  public void setHoTen(String hoTen) {
    this.hoTen = hoTen;
  }

  public void setDiem(double diem) {
    this.diem = diem;
  }
  //toString

  @Override
  public String toString() {
    return hoTen;
  }
  //Support Method
  private boolean checkDiem()
  {
    return this.diem>=24;
  }
  //Service Method
  public void checkHopLeDiem()
  {
    if(checkDiem()==true)
    {
      System.out.println("Điểm hợp lệ, tiếp tục nhập thông tin");
    }else System.out.println("Kiểm tra điểm đầu vào của SV");
  }

  //Parametter List
  public double tongDiem(double ... arr)
  {
    double tong=0.0;
    for(double x:arr)
    {
      tong+=x;
    }
    return tong;
  }
}
