package TruongDH.LyThuyet;

import java.util.Scanner;

public class hamjava {
  public static void main(String[] args) {
    int kq=cong(9,3,4);
    System.out.println("Tổng các số là "+kq);
    Scanner sc=new Scanner(System.in);
    String gt=sc.nextLine();
    System.out.println("Nhập giới tính");
    xinchao(gt);
  }
  //hàm trả về
  public static int cong(int a,int b,int z)
  {
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(z);
    return a+b+z;
  }
  //hàm thủ tục
  public static void xinchao(String gioitinh)
  {
    if(gioitinh.equals("female"))
    {
      System.out.println("Xin chào tôi là nhân viên nữ");
    }
    if(gioitinh.equals("male"))
    {
      System.out.println("Xin chào tôi là nhân viên nam");
    }
  }

}
