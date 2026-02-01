package TruongDH.LyThuyet;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class bai28_bt31 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Nhap so phan tu cua mang: ");
    int n= sc.nextInt();
    ArrayList<Integer> listRandom=new ArrayList<>(n);
    Random rd=new Random();
    for(int i=0;i<n;i++)
    {
      int gt=rd.nextInt(100);
      listRandom.add(gt);
    }
    System.out.println("List ngẫu nhiên là: "+listRandom);
    int dem=0;
    StringBuilder vt=new StringBuilder();
    for(int i=0;i<n;i++)
    {
      if(listRandom.get(i)<80)
      {
        dem++;
        vt.append(i+" ");
      }
    }
    if(dem==0)
      System.out.println("Không có phần tử nào nhỏ hơn 80");
    else
    {
      System.out.println("Vị trí của các phần tử nhỏ hơn 80 là: "+vt);
    }
  }
}
