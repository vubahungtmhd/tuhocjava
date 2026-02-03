package BaiTapIO;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class DocFile {
  public static void main(String[] args) {
    File newFile=new File("NewFolder/test.txt");
    try(Scanner myReader=new Scanner(newFile))
    {
      if(myReader.hasNextLine())
      {
        String myDaTa=myReader.nextLine();
        System.out.println(myDaTa);
      }
    }
    catch (IOException e)
    {
      System.out.println("Lỗi IO");
      e.printStackTrace();
    }
  }
}
