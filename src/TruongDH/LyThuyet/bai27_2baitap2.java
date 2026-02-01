package TruongDH.LyThuyet;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;
import java.util.Scanner;

public class bai27_2baitap2 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Nhập số phần tử của mang: ");
    int n=sc.nextInt();
    System.out.println("Nhập các phần tử của mảng: ");
    int[] mangNguyen= new int[n];
    for(int i=0;i<n;i++)
    {
      System.out.print("M["+i+"]= ");
      mangNguyen[i]=sc.nextInt();
      System.out.println("\n");
    }
    System.out.println("Mảng vừa nhập là: ");
    System.out.println(Arrays.toString(mangNguyen));
    for(int i=0,j=mangNguyen.length-1;i<j;i++,j--)
    {
      int temp=mangNguyen[i];
      mangNguyen[i]=mangNguyen[j];
      mangNguyen[j]=temp;
    }
    System.out.println("Mảng sau khi đảo");
    System.out.println(Arrays.toString(mangNguyen));
    //Sắp xếp tăng
    Arrays.sort(mangNguyen);
    System.out.println("Mảng sau khi sắp xếp tăng: ");
    System.out.println(Arrays.toString(mangNguyen));
    //Tính tổng
    int tong=0;
    for(int x:mangNguyen)
    {
      tong+=x;
    }
    System.out.println("Tổng các phần tử là: "+tong);
    //Tìm index của số bất kì
    System.out.println("Nhập số cần kiem tra: ");
    int gt=sc.nextInt();
    int dem=0;
    boolean kiemtra=false;
    String vt="";
    for(int i=0;i<n;i++)
    {
      if(mangNguyen[i]==gt)
      {
        kiemtra=true;
        vt+=(i+ " ");
      }
    }
    if(kiemtra)
    {
      System.out.println("Số "+gt+" Có tồn tại trong mảng và có vị trí: "+vt);

    }
    else
      System.out.println("Số "+gt+" Không tồn tại trong mảng");
    sc.close();
  }
}
