package XuLyTepTin.BaiTapXuLyFile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ghi_Va_KiemTraQuyen {
  public static void main(String[] args) throws IOException {

    try(FileWriter myFile=new FileWriter("ghichu.txt",true))
    {
      myFile.write("Học Java File I/O thật là thú vị :))");
      System.out.println("Ghi thành công");
    }
    catch (IOException eIO) {
      System.out.println("Phát hiện lỗi: ");
      eIO.printStackTrace();
    }
    File myFile1=new File("ghichu.txt");
    if(myFile1.exists())
    {
      System.out.println("Quyển đọc: "+myFile1.canRead());
      System.out.println("Quyền ghi: "+myFile1.canWrite());
    }
    else
      System.out.println("File không tồn tại");
  }
}
