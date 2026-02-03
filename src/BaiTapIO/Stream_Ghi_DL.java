package BaiTapIO;

import java.io.FileOutputStream;
import java.io.IOException;

public class Stream_Ghi_DL {
  public static void main(String[] args) {
    try(FileOutputStream output=new FileOutputStream("NewFolder/test.txt",true)) {
      String noiDung="\nKhông cho là chó: ";
      output.write(noiDung.getBytes());
      System.out.println("Ghi dữ liệu thành công");
    }
    catch (IOException e)
    {
      System.out.println("IO ERROR");
      e.printStackTrace();
    }
  }
}
