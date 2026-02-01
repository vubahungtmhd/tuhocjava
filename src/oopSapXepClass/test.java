package oopSapXepClass;

import java.util.ArrayList;
import java.util.Collections;

public class test {
  public static void main(String[] args) {
    ArrayList<SanPham> ds=new ArrayList<>();
    SanPham sp1=new SanPham(1,"Samsung",1000);
    SanPham sp2=new SanPham(2,"Iphone",8000);
    SanPham sp3=new SanPham(3,"TranHoa",500);
    SanPham sp4=new SanPham(4,"Huawei",1700);
    //Them vao cuoi danh sach
    ds.add(sp1);
    ds.add(sp2);
    ds.add(sp3);
    ds.add(sp4);
    //Xuat danh sach
    for(SanPham x:ds)
    {
      System.out.println(x);
    }
    //Goi Phuong thuc sap xep là
    Collections.sort(ds);
    //Danh sach sau khi sap xep la
    System.out.println("Danh sach sau khi sắp xếp là");
    for(SanPham X:ds)
    {
      System.out.println(X);
    }
  }
}
