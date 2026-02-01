package TruongDH.LyThuyet;

import java.util.Calendar;
import java.util.Scanner;

public class bai22_vidu {
  public static void main(String[] args) {
    int day,month,year,tuoi;
    Scanner sc=new Scanner(System.in);
    System.out.println("Mời nhập vào ngày sinh: ");
    day=sc.nextInt();
    System.out.println("Mời nhập vào tháng sinh: ");
    month=sc.nextInt();
    System.out.println("Mời nhập vào năm sinh: ");
    year=sc.nextInt();
    //Khởi tạo date
    Calendar birthday=Calendar.getInstance();
    //Set ngày tháng năm sinh
    birthday.set(year,month-1,day);
    int nasinh=birthday.get(Calendar.YEAR);
    int tgsinh=birthday.get(Calendar.MONTH)+1;
    int ngsinh=birthday.get(Calendar.DAY_OF_MONTH);
    System.out.println("Ngày tháng năm sinh: "+ngsinh+"/"+tgsinh+"/"+nasinh);
    //Tính tuổi
    Calendar now=Calendar.getInstance();
    int namht=now.get(Calendar.YEAR);
    tuoi=namht-nasinh;
    System.out.println("Tuổi của bạn là "+tuoi);
  }
}
