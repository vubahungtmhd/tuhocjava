package TruongDH.LyThuyet;

import java.util.Scanner;
import java.util.SimpleTimeZone;

public class bai26_20 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String passd = "";
    while (true) {
      System.out.println("Mời thiết lập mật khẩu");
      System.out.println("Mật khẩu phải ít nhất 6 kí tự, 1 chữ hoa hoặc thường và 1 sô");
      String newPassword = sc.nextLine();
      if (checkMk(newPassword)) {
        passd = newPassword;
        System.out.println("Mật khẩu mới đã được thiết lập");
        break;
      } else {
        System.out.println("Mật khẩu không hợp lệ, xin vui lòng nhập lại !");

      }

    }
    int count = 0;
    String login = "";
    while (true) {
      System.out.println("Mời nhập mật khẩu");
      login = sc.nextLine();
      //Kt mật khẩu có khớp k
      if (login.equals(passd)) {
        System.out.println("Đăng nhập thành công");
        break;
      } else {
        System.out.println("Mật khẩu sai, vui lòng nhập lại");
        count++;
      }
      if (count >= 5) {
        System.out.println("Đăng nhập thất bại");
        break;
      }
    }
  }
  public static boolean checkMk(String password)
  {
    //Kiểm tra độ dài
    if (password.length()<6)
      return false;
    boolean hasletter=false;
    for(char c:password.toCharArray())
    {
      if(Character.isLetter(c)) {
        hasletter = true;
        break;
      }
    }
    if(!hasletter)
      return false;
    boolean hasnumber=false;
    for(char c: password.toCharArray())
    {
      if(Character.isDigit(c))
      {
        hasnumber=true;
        break;
      }
    }
    if(!hasnumber)
    {
      return false;
    }
    return true;
  }
}
