package TruongDH.LyThuyet;

import java.util.Scanner;

public class bai26_25 {
  public static void main(String[] args) {
    //Kiểm tra xem chuỗi nhập vào có phải là chuỗi đối xứng k
    Scanner sc=new Scanner(System.in);
    System.out.println("Nhập chuỗi: ");
    String str=sc.nextLine();
    StringBuilder chuoidao=new StringBuilder(str);
    String rts=chuoidao.reverse().toString();
    //String rts=new StringBuilder(str).reverse().toString()
    System.out.println(str);
    System.out.println(rts);
    if(str.equalsIgnoreCase(rts))
    {
      System.out.println("Đây là chuỗi panlyndrone: ");
    }
    else System.out.println("Đây không phải chuỗi panlyndrone: ");
  }
}
