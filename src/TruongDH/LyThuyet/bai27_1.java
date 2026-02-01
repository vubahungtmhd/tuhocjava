package TruongDH.LyThuyet;

public class bai27_1 {
  public static void main(String[] args) {
    //Khai báo mảng
    String[] mangStr;
    float[] mangFl;
    double[] mangDb;
    //Khởi tạo kèm kích thước
    String[] mangStr2=new String[12];
    int[] mangInt =new int[19];
    //Khởi tạo kèm giá trị ban đầu
    String[] mangStr3=new String[]{"Hoang Hai","Quoc Thiên","Hòa Minzy","Hà Anh Tuấn"};

    //Truy xuất phần tu của mảng dựa theo index
    System.out.println(mangStr3[2]);
    //System.out.println(mangStr3.length);
    //Duyet mang
    int[] mangInt2={1,2,3,5,6,7};
    for(int pt:mangInt2) {
      System.out.println(pt);
    }
    String[] mang5=new String[]{"Trung Quân Idol","Hoang Hai","Quoc Thiên","Hòa Minzy","Hà Anh Tuấn"};
    for(String str:mang5)
    {
      System.out.print(str+", ");
    }
    System.out.println("\n");
    //Duyet theo index
    for(int i=0;i<mangInt2.length;i++)
    {
      System.out.println(mangInt2[i]);
    }
    for(int i=0;i<mang5.length;i++)
    {
      System.out.println(mang5[i]);
    }
    mang5[0]="obama";
    mang5[2]="ronaldo";
    System.out.println("Mảng sau khi thay dổi");
    for(int i=0;i<mang5.length;i++)
    {
      System.out.println(mang5[i]);
    }
    int[] mangInt7 =new int[]{1,2,3,4,5,6,7};
    for (int i=0;i<mangInt7.length;i++)
    {
      mangInt7[i]+=2;
    }
    for (int i=0;i<mangInt7.length;i++)
    {
      System.out.println(mangInt7[i]);
    }
  }
}
