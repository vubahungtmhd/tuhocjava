package TruongDH.LyThuyet;

import java.util.Scanner;

public class ptb2_ham {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Nhập lần lượt a,b,c= ");
    double x=sc.nextDouble();
    double y=sc.nextDouble();
    double z=sc.nextDouble();
    String kq=giaiptb2(x,y,z);
    System.out.println(kq);
  }
  public static String giaiptb2(double a,double b, double c)
  {
    if(a==0)
    {
      if(b==0&&c==0)
        return "Phương trình bậc 1 vô số nghiệm";
      else if(b==0&&c!=0)
        return "Phương trình vô nghiệm";
      else return "Phương trình bac nhat có nghiệm "+(-c/b);
    }
    else{
      double delta=(b*b-4*a*c);
      if(delta<0)
      {
        return "Phương trình vô nghiệm";
      }
      else if(delta==0)
      {
        return "Phương trình có nghiệm kép"+(-b/2*a);
      }
      else
      {
        double x1=(-b+Math.sqrt(delta))/(2*a);
        double x2=(-b-Math.sqrt(delta))/(2*a);
        return "Phương trình bậc 2 có 2 nghiệm phân biệt x1= "+x1+" x2= "+x2;
      }
    }
  }
}
