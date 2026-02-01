package Enum;

public class SV {
  private int ma;
  private String ten;
  private double dtb;
  private XepLoai loai;
  //Constructor

  public SV(int ma, String ten, double dtb) {
    this.ma = ma;
    this.ten = ten;
    this.dtb = dtb;
    this.loai=getLoai();
  }
  //Phương thức để getLoai
  public XepLoai getLoai()
  {
    if(this.dtb>=8)
      loai=XepLoai.gioi;
    else if(this.dtb>=6.5)
      loai=XepLoai.kha;
    else if (this.dtb>=5.0)
      loai=XepLoai.tb;
    else if(this.dtb>3.0)
      loai=XepLoai.yeu;
    else loai=XepLoai.duoiHoc;
    return loai;
  }
  //toString

  @Override
  public String toString() {
    return ma +" " +ten + " " + dtb +" "+ this.loai.des();
  }
}
