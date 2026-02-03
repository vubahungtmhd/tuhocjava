package BaiTapIO;

import java.io.FileInputStream;
import java.io.IOException;

public class Stream_Doc_DL {
  public static void main(String[] args) {
    try(FileInputStream input=new FileInputStream("NewFolder/test.txt"))
    {
      int i;
      while((i=input.read())!=-1)
      {
        System.out.print((char) i);
      }
    }
    catch (IOException e)
    {
      System.out.println("IO ERROR");
      e.printStackTrace();
    }
  }
}
