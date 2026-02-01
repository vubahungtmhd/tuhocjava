package Enum;

import java.util.ArrayList;

public class testEnum {
  public static void main(String[] args) {
    //Kiểm tra vị trí các giá trị trong enum
    System.out.println(XepLoai.tb.ordinal());//Lấy ra vị trí của trung bình
    ArrayList<SV> ds=new ArrayList<>();
    SV sv1=new SV(1,"Trần Thị Hòa",2.5);
    SV sv2=new SV(2,"Bùi Thị Huế",4.5);
    SV sv3=new SV(3,"Nguyễn Thị Thu Hằng",8.3);
    SV sv4=new SV(4,"Nguyễn Kim Chi",7.8);
    //Thêm vào list
    ds.add(sv1);
    ds.add(sv2);
    ds.add(sv3);
    ds.add(sv4);
    //In thông tin ds vuawf nhap
    for(SV X:ds)
    {
      System.out.println(X);
    }
  }
}
