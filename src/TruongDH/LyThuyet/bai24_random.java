package TruongDH.LyThuyet;

import java.sql.SQLOutput;
import java.util.Random;

public class bai24_random {
  public static void main(String[] args) {
    Random rd=new Random();
    int soNguyen=rd.nextInt(-50,51);//Chạy từ -50 đến 50
    System.out.println(soNguyen);// có thể bỏ gốc -50 thì nó sẽ tự hiểu là từ 0 đến 50

    double x=rd.nextDouble(-100,101);
    System.out.println(x);
  }
}
