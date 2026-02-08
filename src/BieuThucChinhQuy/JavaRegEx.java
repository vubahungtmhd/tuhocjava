package BieuThucChinhQuy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegEx {
  public static void main(String[] args) {
    //Khai báo pattern
    Pattern pattern=Pattern.compile("Hung",Pattern.CASE_INSENSITIVE);
    //Tìm kiếm dựa trên chuỗi "Hung", và không phân biệt hoa, thường

    //Khai báo matcher
    Matcher matcher= pattern.matcher("Tên tôi là Hùng");

    //Kết quả
    boolean matchFond= matcher.find();//Tìm xem 1 phần của matcher có khớp với pattern k

    if(matchFond)
    {
      System.out.println("Đã tìm thấy");
    }
    else System.out.println("ko tìm thấy");
  }
}
