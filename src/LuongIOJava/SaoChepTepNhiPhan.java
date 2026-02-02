package LuongIOJava;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class SaoChepTepNhiPhan {
  public static void main(String[] args) {
    try(FileInputStream input=new FileInputStream("images.jpg");
        FileOutputStream output=new FileOutputStream("copy.jpg")) {
      //FileInputStream để đọc các byte từ 1 tệp images.jpg
      //FileOutputStream đề ghi các file vào tệp copy.jpg

      int i;
      while ((i=input.read())!=-1)//Đọc từ đầu đến cuối
      {
        output.write(i);//Ghi vào file ouput
      }
      System.out.println("Sao chép thành công");
    }
    catch (IOException e)
    {
      System.out.println("Tệp xử lý lỗi ");
    }
  }
  //Chương trình này đọc image.jpgvà ghi dữ liệu vào tệp copy.jpg.
  //Vì nó hoạt động với các byte thô, nên nó có thể sao chép bất kỳ loại tệp nào
  //Văn bản, hình ảnh, âm thanh hoặc PDF.
}
