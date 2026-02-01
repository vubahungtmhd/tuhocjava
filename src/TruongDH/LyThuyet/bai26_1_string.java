package TruongDH.LyThuyet;

public class bai26_1_string {
  public static void main(String[] args) {
    String s="Địt cụ con chó School ăn cứt"+
            "\nPhải chém con chó school";
    System.out.println(s);
    //StringBuilder sn=new StringBuilder("Xin chào");
    StringBuilder chuoi=new StringBuilder();
    chuoi.append("Xin chào ");
    chuoi.append("tôi xin được chửi ");
    chuoi.append("con chó school ");
    //Chèn vào vị trí 10
    chuoi.insert(9,"Tuyên ");
    System.out.println(chuoi);
    // Xóa chuỗi ví dụ 2,7 thì là xóa từ 2 đến 7-1(6)
    chuoi.delete(9,15);
    System.out.println(chuoi);
    System.out.println(chuoi.length());

  }
}
