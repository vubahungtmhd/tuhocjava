package BaiTapIO;

import java.io.File;
import java.io.IOException;

public class Tao_Thu_Muc {
  public static void main(String[] args) {
    File myFolder=new File("NewFolder");
    myFolder.mkdir();
    try {
      File myFile=new File("NewFolder","test.txt");
      if(myFile.createNewFile())
      {
        System.out.println("Tạo file thành công:");
      }
      System.out.println("Tạo file thất bại, hoặc đã tồn tại");
    }
    catch (IOException e)
    {
      System.out.println("ERROR");
      e.printStackTrace();
    }
  }
}
