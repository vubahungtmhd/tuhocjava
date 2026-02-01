package TruongDH.LyThuyet;

import java.util.Locale;

public class Bai26_buoi3 {
  public static void main(String[] args) {
    //s1<s2 phân biệt hoa thường
    String s="Abcd2019";
    String s2="abcd2019";
    int x=s.compareTo(s2);
    System.out.println(x);
    //s=s2 phân biệt hoa thường
    String s3="abcd2019";
    String s4="abcd2019";
    int x2=s3.compareTo(s4);
    System.out.println(x2);
    //s1=s2 không phân biệt hoa thường
    String s5="ABcd2019";
    String s6="aBcD2019";
    int x3=s5.compareToIgnoreCase(s6);
    System.out.println(x3);
    StringBuilder bd=new StringBuilder();
    StringBuilder s7=new StringBuilder("0393940753");
    //Chèn thêm vào chuôi
    s7.insert(2,"Hungbavu");//Chèn vào vị trí 2( trước số 3)
    System.out.println(s7);
    //Chèn vào cuối chuỗi
    s7.append("Hungbavu");
    System.out.println(s7);
    //Xóa từ start đến end
    StringBuilder s8=new StringBuilder("123456789");
    s8.delete(1,4);// xóa 2,3,4
    System.out.println(s8);
    //Đảo ngược chuỗi
    StringBuilder s9=new StringBuilder("1234567");
    System.out.println(s9);
    s9.reverse();
    System.out.println(s9);
    //Tách chuối
    String s10="Hello, word Hung, có ny";
    String[] mang=s10.split(", ");
    for(int i=0;i<mang.length;i++)
    {
      System.out.println(mang[i]);
    }
    String s11="CHUNG TA LA CAI DEO GI";
    String s12=s11.toLowerCase();
    String s13=s11.toUpperCase();
    System.out.println(s11);
    System.out.println(s12);
    System.out.println(s13);
    // Chuyển chuỗi thafnh mảng kí tự
    String s14="abcdefghifk";
    char[] mang2=s14.toCharArray();
    for(int i=0;i<mang2.length;i++)
    {
      System.out.println(mang2[i]);
    }
    String s15="12345678";//Không dùng được reverse()
    StringBuilder s16=new StringBuilder(s15);
    s16.reverse();
    String s17=s16.toString();
    System.out.println(s17);
  }
}
