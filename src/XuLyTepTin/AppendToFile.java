package XuLyTepTin;

import java.io.FileWriter;
import java.io.IOException;

public class AppendToFile {
  public static void main(String[] args) {
    //Thao tác này sẽ thêm dữ liệu vào cuối file, không ghi đè nội dung trước
    try(FileWriter myFile=new FileWriter("Ghi_Du_Lieu.txt",true))
    {
      myFile.write("\nCác bạn cho mình một like và một chia sẻ nha");
      System.out.println("Thêm dữ liệu thành công: ");
    }
    catch (IOException e)
    {
      System.out.println("Đã phát hiện lỗi");
      e.printStackTrace();
    }
  }
}
