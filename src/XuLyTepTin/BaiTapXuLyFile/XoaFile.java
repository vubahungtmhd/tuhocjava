package XuLyTepTin.BaiTapXuLyFile;

import java.io.File;
import java.io.IOException;

public class XoaFile {
  public static void main(String[] args) {
    File fileTam=new File("temp.txt");
    try
    {
      if(fileTam.createNewFile())
      {
        System.out.println("Tạo file thành công");
      }
      else
        System.out.println("File đã tồn tại: ");

    }
    catch (IOException ioe)
    {
      System.out.println("Phát hiện lỗi");
      ioe.printStackTrace();
    }
    if(fileTam.delete())
      System.out.println("Xóa thành công file vừa tạo: ");
    else
      System.out.println("File không tồn tại");


  }
}
