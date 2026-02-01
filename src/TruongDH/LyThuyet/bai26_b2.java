package TruongDH.LyThuyet;

public class bai26_b2 {
  public static void main(String[] args) {
    String s=" tôi đi tìm tôi";
    System.out.println(s.indexOf("tôi"));
    System.out.println(s.lastIndexOf("tôi"));
    System.out.println(s.indexOf("em"));
    //Kiểm tra chuỗi con
    String s9="mp3";
    String s10="tuhoc.mp9";
    boolean check=s10.contains(s9);
    if(check)
    {
      System.out.println("Có mp3 trong chuỗi");
    }
    else
    {
      System.out.println("Không tìm thấy mp3 trong chuỗi");
    }
    //SubString
    String s11="abcdefgh";
    String s12=s11.substring(4);//Từ 4 đến hết
    System.out.println(s11);
    System.out.println(s12);
    String s13=s11.substring(4,7);//Từ 4 4 đến sát số 7
    System.out.println(s13);
    //Thay thế
    String s14="Tôi đi tìm Tôi";
    String s15=s14.replace("Tôi","Bạn");
    System.out.println(s15);
    //Thay thế đầu
    String s16=s14.replaceFirst("Tôi","Bạn");
    System.out.println(s16);
    //xóa khoảng trắng đầu và cuối
    String s18="                       Gà lại lập trình           ";
    String s19=s18.trim();
    System.out.println(s18);
    System.out.println(s19);
    //trim xóa toàn khoảng trắng ở cuối
    String s20=s18.replaceAll("\\s+$","");
    System.out.println(s20);
    System.out.println(s18.length());
    System.out.println(s20.length());
    //Xóa khoảng trắng ở cuối chuỗi dùng while
    String s21="            Gà lại lập trình:             ";

    while (s21.endsWith(" "))
    {
      s21=s21.substring(0,s21.length()-1);

    }
    System.out.println(s21);
    //Xóa khoảng trắng ở đầu
    String s23="        Gà lại lập trình:           ";
    String s24=s23.replaceFirst("^\\s+","");
    System.out.println(s23);
    System.out.println(s24);
    //Xóa khoảng trắng đầu đùng vòng lặp
    String s25="           Gà lại lập trình              ";
    while(s25.startsWith(" "))// có bat đầu bằng " " không
    {
      s25=s25.substring(1);// lấy chuỗi con từ vị trí 1 vì vị trí 0 là dấu cách
    }
    System.out.println(s25);
  }
}
