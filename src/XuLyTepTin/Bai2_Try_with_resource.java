package XuLyTepTin;

import java.io.FileWriter;
import java.io.IOException;

public class Bai2_Try_with_resource {


  public static void main(String[] args) {
    try(FileWriter myFile=new FileWriter("Ghi_Du_Lieu.txt"))
    {
      myFile.write("Xin chào các bạn hihihi");
      //Thao tác này sẽ ghi đè nội dung, để k ghi đè ta sử dụng append
      System.out.println("Ghi thành công: ");
    }
    catch(IOException E)
    {
      System.out.println("Phát hiện lỗi");
      E.printStackTrace();
    }
  }
}
