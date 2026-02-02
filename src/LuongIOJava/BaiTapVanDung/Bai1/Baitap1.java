package LuongIOJava.BaiTapVanDung.Bai1;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.*;
import java.util.Scanner;


public class Baitap1 {
  public static void main(String[] args) {
    //1. Khởi tạo hệ thống
    //Tạo thư mục
    File folder=new File("logs");
    if(!folder.exists())
    {
      if(folder.mkdir())
      {
        System.out.println("Tạo thư mục logs thành công");
      }
      else {
        System.out.println("Tạo thư mục 'logs' thành công");
      }
    }
    else
    {
      System.out.println("Không thể tạo thư mục logs");
    }
    //Tạo tập tin
    try
    {
      File myFile=new File("logs/security_log.txt");
      if(myFile.createNewFile())
      {
        System.out.println("Tạo file mới thành công");
      }
      else System.out.println("File đã tồn tại");
    }
    catch (IOException e)
    {
      System.out.println("Phát hiện lỗi");
      e.printStackTrace();
    }
    //2. Ghi dữ liệu
    try(BufferedWriter bw=new BufferedWriter(new FileWriter("logs/security_log.txt",true))) {
      bw.write("Họ và tên: Hùng");
      bw.newLine();
      bw.write("Thời gian đăng nhập: 10h");
      bw.newLine();
      System.out.println("Dữ liệu đã ghi thành công");
    }
    catch (IOException E)
    {
      System.out.println("Đã phát hiện lỗi");
      E.printStackTrace();
    }
    //3. Sao lưu dữ liệu
    try(
            FileInputStream input=new FileInputStream("logs/security_log.txt");
            FileOutputStream output=new FileOutputStream("logs/security_log_backup.txt"))
    {
      int i;
      while((i=input.read())!=-1)
      {
        output.write(i);
      }
      System.out.println("Đã Backup thành công");
    }
    catch (IOException E)
    {
      System.out.println("Phát hiện lỗi");
      E.printStackTrace();
    }
  //4. Kiểm tra file backup
    try(BufferedReader br=new BufferedReader(new FileReader("logs/security_log_backup.txt")))
    {
      String line;
      int lineCount=1;
      while ((line= br.readLine())!=null)
      {
        System.out.println("Dòng"+lineCount +line);
        lineCount++;
      }
      System.out.println("データが表示される");
    }
    catch (IOException E)
    {
      System.out.println("エーラーが発見された");
      E.printStackTrace();
    }
    Scanner sc=new Scanner(System.in);
    System.out.println("Có xóa backup không? (Y/N)");
    String luachon=sc.nextLine();
    if(luachon.equalsIgnoreCase("y"))
    {
      File deleteFile=new File("logs/security_log_backup.txt");
      if(deleteFile.delete())
      {
        System.out.println("Xóa thành công file backup");
      }
      else
        System.out.println("Lỗi xóa file");
    }
    else
      System.out.println("Kết thúc chương trình");
    sc.close();
  }
}
