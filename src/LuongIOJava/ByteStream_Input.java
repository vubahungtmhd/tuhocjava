package LuongIOJava;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteStream_Input {
  public static void main(String[] args) {
    //Sử dụng FileInputStream để đọc một tập tin văn bản, từng byte một và in ra màn hình
    try(FileInputStream input=new FileInputStream("fileName.txt"))
    {
      int i;//Lưu trữ từng byte đọc được
      while ((i=input.read())!=-1)//Đọc cho đến hết tập tin
      {
        System.out.println((char) i);//Chuyển đổi dữ liệu byte sang kí tự
      }
    }
    catch(IOException e)
    {
      System.out.println("Lỗi đọc file");
      e.printStackTrace();

    }
  }
}
