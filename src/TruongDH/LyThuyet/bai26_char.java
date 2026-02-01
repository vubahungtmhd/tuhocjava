package TruongDH.LyThuyet;

import java.sql.SQLOutput;
import java.util.Scanner;

public class bai26_char {
  public static void main(String[] args) {
    /*//Khởi tạo
    char ch='a';
    char ch2=66;
    System.out.println(ch2);
    //Khai báo
    char ch3;
    Scanner sc=new Scanner(System.in);
    System.out.println("Mời nhập vào kí tự: ");
    String s=sc.nextLine();
    char ch4=s.charAt(0);//Lấy kí tự đầu tiên của chuỗi s nếu s nhiều hơn 1 kí tự
    System.out.println("Kí tự vừa nhập vào: "+ch4);
    System.out.println(Character.compare('b','b'));
    System.out.println(Character.compare('a','b'));
    System.out.println(Character.compare('b','B'));
*/
    char ch5='1';
    char ch6='a';
    char ch7='A';
    char ch8=' ';
    System.out.println(Character.isDigit(ch5));
    System.out.println(Character.isLowerCase(ch6));
    System.out.println(Character.isUpperCase(ch7));
    System.out.println(Character.isWhitespace(ch8));
  }
}
