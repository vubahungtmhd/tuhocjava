package BieuThucChinhQuy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MetaCharacter {
  public static void main(String[] args) {
    /*Đề bài
    Gồm 4 kí tự:
    kí tự đầu bất kì: .
    3 kí tự sau là số: [0-9] or (\d và n{})
    */

    //khai báo pattern
    //Pattern pattern=Pattern.compile(".[0-9][0-9][0-9]");//Cách đơn giản nhất
    Pattern pattern=Pattern.compile(".\\d{3}");//Cách đơn giản nhất

    //Khai báo matcher
    Matcher matcher =pattern.matcher("@12a");

    //
    boolean check=matcher.find();

    if(check)
      System.out.println("Tìm thấy");
    else
      System.out.println("Không tìm thấy");

   /*
   Bắt đầu là chữ u: ^
   Sau đó thêm 4 chữ số: \d + n{}
   Chỉ tổng là 5 kí tự (u + 4 kí tự)
   */
    Pattern p1=Pattern.compile("^u\\d{4}$");
    Matcher m1=p1.matcher("a1345");
    boolean check1=m1.find();
    System.out.println(check1);
    /*
    Bắt đầu là số hoặc chữ cái: \w nó có dạng [a-zA-Z0-9_] nên nếu nhập _ vẫn thỏa mãn
    Kí tự thứ 2 là khoảng trắng: \s
    Và sau đó là một chữ cái hoặc số: \w
    vd: A B và c 1....
    * */
    //Pattern p2=Pattern.compile("\\w\\s\\w$");//nó có dạng [a-zA-Z0-9_] nên nếu nhập _ vẫn thỏa mãn
   Pattern p2=Pattern.compile("[a-zA-Z0-9]\\s[a-zA-Z0-9]");//sẽ loại bỏ đuợc _

    Matcher m2=p2.matcher("4 d");
    boolean check2=m2.find();
    System.out.println(check2);
    /*
    //Bắt đầu bằng 2 chữ số
    //Tiếp theo là dấu -
    //Kết thúc bằng chữ hoa A-Z

    */
    Pattern p3=Pattern.compile("\\d{2}\\-[A-Z]$");
    Matcher m3=p3.matcher("A3-3");
    boolean check3=m3.find();
    System.out.println(check3);
    /*
    * Bắt đầu 1 trong 3 H,D và N
    * Theo sau là đúng 2 chữ số
    *
    * */
    Pattern p4=Pattern.compile("[HDN]\\d{2}$");
    Matcher m4=p4.matcher("H15");
    boolean check4=m4.find();
    System.out.println(check4);

    /*
    * CHỉ chứa các chữ cái và số
    * Dài ít nhất là 6 và k giới hạn X{n,} dãy x chứa ít nhất n kí tự
    * */
    Pattern p5=Pattern.compile("[a-zA-Z0-9]{6,}");
    Matcher m5=p5.matcher("abc1234");
    boolean check5=m5.find();
    System.out.println(check5);
    /*
    Kiểm tra xem phải là tên file ảnh k: vd a.jpg
    Ít nhất 1 kí tự sau đó là đuôi .jpg:  nhớ . và \\. khác nhau
     */
    //Pattern p6=Pattern.compile("\\w{1,}.jpg$");đúng một vài hoặc nhiều hơn
    Pattern p6=Pattern.compile("\\w+.jpg$");//đúng với 1 hoặc nhiều,
    Matcher m6=p6.matcher("gggat.jpg");
    boolean check6=m6.find();
    System.out.println(check6);

    /*
    2 Chữ cái viết Hoa [A-Z]   n{x}
    Khoảng trắng: dấu cách or \\s
    Chuỗi từ 3,5: n(x,y)
    */
    Pattern p7=Pattern.compile("[A-Z]{2}\\s\\d{3,5}");
    Matcher m7=p7.matcher("AB 12345");
    boolean check7=m7.find();
    System.out.println(check7);
  }
}
