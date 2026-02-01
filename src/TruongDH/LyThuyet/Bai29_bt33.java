package TruongDH.LyThuyet;

import java.util.HashMap;
import java.util.Scanner;

public class Bai29_bt33 {
  public static void main(String[] args) {
    HashMap<String,String> user=new HashMap<>();
    user.put("user1","123456");
    user.put("user2","123456");
    user.put("user3","123456");
    user.put("user4","123456");
    user.put("user5","123456");
    user.put("user6","123456");
    user.put("user7","123456");
    user.put("user8","123456");
    user.put("user9","123456");
    user.put("user10","123456");
    Scanner sc=new Scanner(System.in);
    System.out.println("Nhập username: ");
    String username=sc.nextLine();
    System.out.println("Nhập password: ");
    String password=sc.nextLine();
    if(!user.containsKey(username))
      System.out.println("Tên người dùng không tồn tại");
    else if(!user.get(username).equals(password))
      System.out.println("Sai mật khẩu");
    else
      System.out.println("Đăng nhập thành công");
  }
}
