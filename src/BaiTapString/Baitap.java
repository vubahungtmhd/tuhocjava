package BaiTapString;

public class Baitap {
  public static void main(String[] args) {
    //So sanh chuoi
    String chuoi1="Chao HOa";
    String chuoi2="Chao Hang";
      //Phan biet hoa thuong
      System.out.println(chuoi1.compareTo(chuoi2));
      //Khong phan biet hoa thuong
      System.out.println(chuoi1.compareToIgnoreCase(chuoi2));
    //Ki tu xuat hien cuoi cung ta su dung lastIndex
    String chuoi3="Hello, Chao Hoa nha yeu em Hello kkkk";
    int lastIndex=chuoi3.lastIndexOf("Hello");
    if(lastIndex==-1)
    {
      System.out.println("Khong tim thay chuoi con");
    }
    else System.out.println("Vi tri chuoi Hello trong chuoi la "+lastIndex);
  //Xoa ki tu tai vi tri cu the
    StringBuilder chuoi4=new StringBuilder();
  //Them vao Stringbuider chen vao vi tri cuoi ta dung append()
    chuoi4.append("Be Hoa cute");
    chuoi4.append(" la cua");
    chuoi4.append(" anh");
    System.out.println(chuoi4);
  //Sau khi mang co phan tu thi co the chen bang lenh insert
    chuoi4.insert(3,"Tran ");
    System.out.println(chuoi4);
    //Xoa mot xau
    chuoi4.delete(12,17);
    System.out.println(chuoi4);
    //Tinh do dai chuoi
    int a=chuoi4.length();
    System.out.println("Do dai cua chuoi: "+a);
  //Kiem tra vi tri dau tien cua ki tu hoc chuoi indexOf
    String chuoi5="Hom nay anh nho em vcl, yeu em vc, con bo Chi dan, em la con cho ";
    System.out.println("Vi tri dau tien cua chuoi em la"+chuoi5.indexOf("em"));
    System.out.println("Vi tri cuoi cung cua chuoi em la"+chuoi5.lastIndexOf("em"));
  //Kiem tra ton tai dung contains
    boolean kiemtra=chuoi5.contains("Chi");
    System.out.println(kiemtra);
  //Lay 1 chuoi con trong chuoi goc tu vi tri 8 den het
    String chuoiCon=chuoi5.substring(8);
    System.out.println(chuoiCon);
  //Lay 1 chuoi co diem dau va diem cuoi
    String chuoiCon2=chuoi5.substring(8,18);
    System.out.println(chuoiCon2);
    //Thay the chuoi
    String chuoiBanDau="Anh the voi Hoa anh chi yeu minh Hoa thoi";
    System.out.println(chuoiBanDau);
    String chuoiSau=chuoiBanDau.replace("Hoa","Chi");
    System.out.println(chuoiSau);
    //Thay the dau tien tim thay
    String thayDauTien="Lam nguoi yeu anh di nhe Hue oi boi vi anh da yeu Hue mat roi";
    String thayDauTien1=thayDauTien.replaceFirst("Hue","Hoa");
    System.out.println(thayDauTien1);
  }
}
