package Baitap_method;

import java.util.Scanner;

public class Baitap {
  static void myMethod()
  {
    System.out.println("Chúng ta đéo là gì của nhau cả");
  }
  static int tinhTong(int a,int b)
  {
    return a+b;
  }
  static float tinhTong(float a,float b)
  {
    return  a+b;
  }

  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    myMethod();
    //tinh tong cac so nguyen
    System.out.println("Nhap so a: ");
    int a=input.nextInt();
    System.out.println("Nhap so b: ");
    int b=input.nextInt();
    int tong=tinhTong(a,b);
    System.out.println("a+b= "+tong);
    //tinh tong cac so thuc
    float tongThuc=tinhTong(5.6f,10.2f);
    System.out.println("Tong 2 so thuc "+tongThuc);
  }
}

