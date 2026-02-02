package XuLyTepTin;

import javax.imageio.IIOException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Bai2_Ghi_Vao_Tep {
  public static void main(String[] args) {
    try{

      /*
      //tạo file
      File file=new File("Ghi_Du_Lieu.txt");
      if(file.createNewFile())
      {
        System.out.println("Tạo file thành công: "+file.getName());
      }
      else
      {
        System.out.println("File đã tồn tại");
      }*/
      //Ghi dữ liệu
      //Khởi tạo file write

      FileWriter myFile=new FileWriter("Ghi_Du_Lieu.txt");
      myFile.write("Chào các bạn tôi mới học quản lý file Java");
      myFile.close();
      System.out.println("Ghi thành công vao file");
    }
    catch (IOException e)
    {
      System.out.println("Đã phát hiện lỗi");
      e.printStackTrace();
    }
    //Thao tác này sẽ ghi đè dữ liệu cũ
  }
}
