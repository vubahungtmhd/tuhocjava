/*
Phải đặt trong khối try..catch
//Kiểm tra tồn tại: file.exist() (trả về true false)
//Tạo file mới: file.creatFile()(trả về true nếu thành công)
//Lấy tên file: file.name()
//Lấy đường dẫn: file.getAbsolutePath()
//Kiểm tra kích thước: file.length(). tính bằng byte
canRead()	Boolean	Tests whether the file is readable or not
canWrite()	Boolean	Tests whether the file is writable or not
createNewFile()	Boolean	Creates an empty file
delete()	Boolean	Deletes a file
exists()	Boolean	Tests whether the file exists
getName()	String	Returns the name of the file
getAbsolutePath()	String	Returns the absolute pathname of the file
length()	Long	Returns the size of the file in bytes
list()	String[]	Returns an array of the files in the directory
mkdir()	Boolean	Creates a directory


* */

package XuLyTepTin;
import java.io.File;
import java.io.IOException;
public class Bai1 {

  public static void main(String[] args) {
    try{
      //Khởi tạo đối tượng file
      //Tạo file mới
      File file=new File("data1.txt");
      if(file.createNewFile())
      {
        System.out.println("Tạo file thành công: "+file.getName());
      }
      else {
        System.out.println("File đã tồn tại");
      }

    }
    catch(IOException e)
    {
      System.out.println("Phát hiện lỗi: ");
      e.printStackTrace();//Hiển thị thông tin lỗi
    }
  }




}
