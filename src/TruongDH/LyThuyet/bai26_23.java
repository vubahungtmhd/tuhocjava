package TruongDH.LyThuyet;

import java.awt.image.CropImageFilter;
import java.util.Scanner;

public class bai26_23 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Mời nhập vào một chuỗi");
    String a=sc.nextLine();
    StringBuilder so=new StringBuilder("");
    StringBuilder chu=new StringBuilder("");
    StringBuilder kitukhac=new StringBuilder("");
    for(int i=0;i<a.length();i++)
    {
      char c=a.charAt(i);
      if(Character.isDigit(c))
      {
          so.append(c);
      }
      else if(Character.isLetter(c))
      {
        chu.append(c);
      }
      else
      {
        kitukhac.append(c);
      }
    }
    System.out.println("Chuỗi toàn chữ là: "+chu);
    System.out.println("Chuỗi toàn sô là "+so);
    System.out.println("Chuỗi ki tu khac là "+kitukhac);
  }
}
