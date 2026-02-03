package BaiTapIO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ghi_Vao_File {
  public static void main(String[] args) {
    System.out.println("Chương trình ghi dữ liệu");
    try(FileWriter file=new FileWriter("NewFolder/test.txt"))
    {
      file.write("Chào các bạn nhé");
      System.out.println("Ghi dữ liệu thành công");
    }
    catch (IOException e)
    {
      System.out.println("ERROR");
      e.printStackTrace();
    }
  }
}
