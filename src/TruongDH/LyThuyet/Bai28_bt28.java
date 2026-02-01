package TruongDH.LyThuyet;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Bai28_bt28 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Nhập số lượng phần tử: ");
    int n=sc.nextInt();
    ArrayList<Integer> listNguyen=new ArrayList<>(n);
    Random rd=new Random();
    int gt;
    for(int i=0;i<n;i++)
    {
      gt=rd.nextInt(0,100);
      listNguyen.add(gt);
    }
    for(int x:listNguyen)
    {
      System.out.println(x);
    }
  }
}
