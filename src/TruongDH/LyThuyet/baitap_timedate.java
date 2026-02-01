package TruongDH.LyThuyet;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class baitap_timedate {
  public static void main(String[] args) {
    Calendar cal = Calendar.getInstance();
    int nam = cal.get(Calendar.YEAR);
    int thang = cal.get(Calendar.MONTH);
    int ngay = cal.get(Calendar.DAY_OF_MONTH);
    System.out.println("Hôm nay là ngày: " + nam + "/" + (thang + 1) + "/" + ngay);
    Scanner sc=new Scanner(System.in);
    int a,b,c;
    System.out.println("Nhập năm sinh: ");
    a=sc.nextInt();
    System.out.println("Nhập tháng sinh: ");
    b=sc.nextInt();
    System.out.println("Nhập ngày sinh: ");
    c=sc.nextInt();
    Calendar sn = Calendar.getInstance();
    sn.set(Calendar.YEAR,a);
    sn.set(Calendar.MONTH,(b-1));
    sn.set(Calendar.DAY_OF_MONTH,c);
    int nams=sn.get(Calendar.YEAR);
    int thangs=sn.get(Calendar.MONTH);
    int ngays=sn.get(Calendar.DAY_OF_MONTH);
    System.out.println("Sinh nhật vào ngày: "+nams+"/"+(thangs+1)+"/"+ngays);
    SimpleDateFormat dg=new SimpleDateFormat("dd/MM/yyyy hh/mm/ss a");
    Date tg=cal.getTime();
    String formattedDate=dg.format(tg);
    System.out.println("Thời gian là: "+formattedDate);
  }
}
