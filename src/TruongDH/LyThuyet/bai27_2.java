package TruongDH.LyThuyet;

import java.util.Arrays;

public class bai27_2 {
  public static void main(String[] args) {
    //Sắp xếp tăng dần
    int[] mang={8,9,12,4,8,1,2,3};
    Arrays.sort(mang);
    System.out.println("Mang sau khi sx tăng là ");
    System.out.println(Arrays.toString(mang));
    //Đảo ngược mảng
    int[] mang2={8,9,12,4,8,1,2,3};
    for(int i=0,j=mang2.length-1;i<j;i++,j--)
    {
      int temp=mang2[i];
      mang2[i]=mang2[j];
      mang2[j]=temp;
    }
    //Xuất mảng
    System.out.println(Arrays.toString(mang2));
    //Phép gán mảng truy xuất cùng vùng nhớ
    int[] mang3={8,9,12,4,8,1,2,3};
    int[] mang4=mang3;
    mang4[4]=100;
    System.out.println(Arrays.toString(mang3));
    System.out.println(Arrays.toString(mang4));
    //clone
    int[] mang5=mang3.clone();
    mang5[0]=99;
    System.out.println(Arrays.toString(mang3));
    System.out.println(Arrays.toString(mang5));

  }
}
