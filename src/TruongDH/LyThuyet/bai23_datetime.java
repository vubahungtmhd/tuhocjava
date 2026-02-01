package TruongDH.LyThuyet;

import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class bai23_datetime {
  public static void main(String[] args) {
    //Xem nội dung
    Calendar cal=Calendar.getInstance();
    System.out.println(cal);
    //Lấy ngày tháng năm
    int nam=cal.get(Calendar.YEAR);
    int thang=cal.get(Calendar.MONTH)+1;//Vì trong đây thang bắt đầu từ 0
    int ngay=cal.get(Calendar.DAY_OF_MONTH);
    System.out.println("Nam: "+nam);
    System.out.println("Thang: "+thang);
    System.out.println("Ngay: "+ngay);
    //Cài ngày tháng năm theo ý muốn
    cal.set(Calendar.YEAR,2007);
    cal.set(Calendar.MONTH,0);
    cal.set(Calendar.DAY_OF_MONTH,23);
    int namsinh=cal.get(Calendar.YEAR);
    int thangsinh=cal.get(Calendar.MONTH)+1;//Vì trong đây thang bắt đầu từ 0
    int ngaysinh=cal.get(Calendar.DAY_OF_MONTH);
    System.out.println("Ngày tháng năm sinh: "+namsinh+"/"+thangsinh+"/"+ngaysinh);
    //Xuất theo định dạng
    SimpleDateFormat dinhDang= new SimpleDateFormat("dd/MM/yyy hh:mm:ss a ");
    //Tạo 1 đôí tượng để get time trong đối tượng
    Date d=cal.getTime();
    String s=dinhDang.format(d);
    System.out.println(s);


  }
}
