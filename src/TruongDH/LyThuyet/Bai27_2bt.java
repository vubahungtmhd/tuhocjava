package TruongDH.LyThuyet;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Bai27_2bt {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    //Nhập số phần tử
    System.out.println("Vui lòng nhập số lượng phần tử của mảng");
    int n=sc.nextInt();
    //Tạo mảng có n phần tử(Cấp phát bộ nhớ cho mảng)
    int[] mangNguyen=new int[n];
    //Nhập dữ liệu cho phần tử
    System.out.println("Nhập giá trị của các phần tử");
    for(int i=0;i<n;i++)
    {
      System.out.print("M["+i+"]= ");
      mangNguyen[i]=sc.nextInt();
      System.out.println("\n");
    }
    System.out.println("Các phần tử của mảng là: ");
    for(int i=0;i<n;i++)
    {
      System.out.println("M["+i+"]="+mangNguyen[i]);
    }
    //System.out.println(Arrays.toString(mangNguyen));
  }
}
