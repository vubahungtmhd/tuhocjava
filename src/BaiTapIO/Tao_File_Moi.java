package BaiTapIO;

import java.io.File;
import java.io.IOException;
import java.sql.SQLOutput;

public class Tao_File_Moi {
  public static void main(String[] args) {
    File myFile=new File("TaoFile.txt");
    try
    {
      if(myFile.createNewFile())
      {
        System.out.println("Tạo file thành công");
      }
      else
      {
        System.out.println("File đã tồn tại");
      }
    }
    catch (IOException E)
    {
      System.out.println("Error");
      E.printStackTrace();
    }
  }
}
