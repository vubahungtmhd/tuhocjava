package TruongDH.LyThuyet;

public class bai26_22 {
  public static void main(String[] args) {
    String a="tôi chăm học tôi chịu khó tôi chém con chó school tôi ghét chó tựa  tôi đẹp trai";
    //dem tu toi trong chuoi tren
    String[] words=a.split(" ");
    int count=0;
    for(String tu:words)
    {
      if(tu.equals("tôi"))
      {
        count++;
      }
    }
    System.out.println("Số lần xuất hiện từ tôi trong a là: "+count);
  }
}
