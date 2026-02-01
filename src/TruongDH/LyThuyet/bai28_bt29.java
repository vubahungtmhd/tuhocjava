package TruongDH.LyThuyet;

import java.util.ArrayList;
import java.util.Scanner;
public class bai28_bt29 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Nhập số lượng phần tử: ");
    int n= sc.nextInt();
    ArrayList<Integer> listNguyen=new ArrayList<>(n);
    for(int i=0;i<n;i++)
    {
      System.out.print("L["+i+"]=" );
      int gt= sc.nextInt();
      listNguyen.add(gt);
    }
    System.out.println("Danh sach vua nhap la: ");
    for(int x: listNguyen)
    {
      System.out.print(x+" ");
    }
    //Tạo ra 1 list mới bằng bình phương các phần tử
    ArrayList<Integer> listBP=new ArrayList<>(n);
    for(int i=0;i<listNguyen.size();i++)
    {
      int x= (int) Math.pow(listNguyen.get(i),2);
      listBP.add(x);
    }
    System.out.println("\nChuỗi bình phương là");
    System.out.println(listBP);
    //Xác định xem có bao nhiêu phần tử lớn hơn 50
    int dem=0;
    for(int x: listBP)
    {
      if(x>50)
        dem++;
    }
    if(dem==0)
      System.out.println("Khong có phần tử lớn hơn 50");
    else System.out.println("So phan tu lon hon 50 là: "+dem);
  }
}
