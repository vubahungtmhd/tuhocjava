package LuongIOJava;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream_Ouput {
  public static void main(String[] args) {
    //Viết 1 chuỗi văn bản vào tệp
    String text="Hôm nay anh mệt rã rời, cần một bờ vai";
    try(FileOutputStream ouput=new FileOutputStream("fileName.txt",true))
    {
      ouput.write(text.getBytes());//Chuyển chuỗi kí tự sang dạng byte và ghi
      System.out.println("Ghi thành công: ");
    }
    catch (IOException ioe)
    {
      System.out.println("Lỗi ghi file: ");
      ioe.printStackTrace();
    }
  }
}
