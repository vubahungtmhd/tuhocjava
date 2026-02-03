package BaiTapIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class copyPhoto {
  public static void main(String[] args) {
    try(FileInputStream input=new FileInputStream("NewFolder/photo.jpg");
        FileOutputStream outpt=new FileOutputStream("NewFolder/copy.jpg"))
      {
      int i;
      while((i=input.read())!=-1)
      {
        outpt.write(i);
      }
        System.out.println("Sao chép thành công");
    }
    catch (IOException e)
    {
      System.out.println("Error");
      e.printStackTrace();
    }
  }
}
