package TruongDH.LyThuyet;

import java.util.Locale;
import java.util.Scanner;

public class BAI26_26 {
  public static void main(String[] args) {
    /*Tối ưu hóa chuỗi
    1. Xóa khoảng trắng dư thừa
    2. Mỗi từ cách nhau 1 khoảng trắng
    3. Kí tự đầu tiên mỗi từ viết hoa*/
    Scanner sc=new Scanner(System.in);
    System.out.println("Nhập chuỗi để chuẩn hóa");
    String input=sc.nextLine();
    System.out.println("Chuoi chuan hoa: "+chuanhoa(input));
  }
  public static String chuanhoa(String input) {
    //Xóa toàn bộ khoảng trang đầu và cuôi
    input = input.trim();
    //Chuyen hoa ve thuong
    String[] words = input.split("\\s+");
    for (int i = 0; i < words.length; i++) {
      words[i]=words[i].toLowerCase();
      String firstchar=words[i].substring(0,1);
      firstchar=firstchar.toUpperCase();
      words[i]=firstchar+words[i].substring(1);
    }
    return String.join(" ",words);
  }
}
