package oopSapXepClass;

import org.jetbrains.annotations.NotNull;

public class SanPham implements Comparable<SanPham>{
  //Thuộc tính
  private int ma;
  private String ten;
  private double gia;
  //Constuctor

  public SanPham(int ma, String ten, double gia) {
    this.ma = ma;
    this.ten = ten;
    this.gia = gia;
  }
  //Phương thức

 /* public int getMa() {
    return ma;
  }

  public String getTen() {
    return ten;
  }*/

  /*public double getGia() {
    return gia;
  }

  public void setMa(int ma) {
    this.ma = ma;
  }

  public void setTen(String ten) {
    this.ten = ten;
  }*/
  //toString để xuất nhanh đối tượng

  @Override
  public String toString() {
    return ma+"\t"+ten+"\t"+gia;
  }



  //sx theo giá
  /*@Override
  public int compareTo(@NotNull SanPham o) {
    if(this.gia<o.gia)
      return 1;
    if(this.gia>o.gia)
      return -1;
    return 0;
  }*/

  //sx theo thứ tự theo tên( alpha)
  @Override
  public int compareTo(@NotNull SanPham o) {
    return this.ten.compareToIgnoreCase(o.ten);
  }
}
