package Bieuthuc_Lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    //Cho phép nhập
    Scanner sc=new Scanner(System.in);
    int a,b;
    System.out.println("Nhập a: ");a=sc.nextInt();
    System.out.println("Nhập b: ");b=sc.nextInt();
    //Khởi tạo lambda
    Calculator add=(x,y)->x+y;
    //hàm tính tổng
    int tong=add.operate(a,b);
    System.out.println("Tổng= "+tong);

    Calculator multiply=(x,y)->x*y;
    //Hàm tính tích
    System.out.println("Tích= "+multiply.operate(a, b));

    //Tạo 1 danh sách
    ArrayList<String> ngonNgu=new ArrayList<>(List.of("Java","Python","C++","JavaScript","Kotlin"));
    //Lambda với forEach()
    System.out.println("Danh sách vừa nhập là: ");
    ngonNgu.forEach(i-> System.out.println(i));
    //Sắp xếp danh sách
    //Collections.sort(ngonNgu);
    ngonNgu.sort((x,y)->x.compareTo(y));
    System.out.println("Dach sách sau khi sắp xếp");
    ngonNgu.forEach(i-> System.out.println(i));
  }
  //Khai báo function interface
  interface Calculator
  {
    int operate(int a,int b);//Hàm trừu tượng: Không có thân hàm
  }
}
