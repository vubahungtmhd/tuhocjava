package TruongDH.LyThuyet;

public class bai26_19 {
  public static void main(String[] args) {
    String strl="English = 68 Science = 90 Math = 70";
    int sum=0;//tổng các sôs
    int count=0;//Số lượng các số
    String[] parts=strl.split(" ");
    //Duyệt theo từng phần vào chuyển sang kiểu số
    for(String pt:parts)
    {
      try{
        //Chuyển chuỗi sang số nếu có thể dùng parseInt()
        int num=Integer.parseInt(pt);
        sum+=num;
        count++;
      }
      catch (NumberFormatException e)
      {
        //Không làm gì cả
      }
    }
    if(count!=0)
    {
      double tbc=(double) sum/count;
      System.out.println("Tổng các số nguyên: "+sum);
      System.out.println("Trung bình cộng các số nguyên: "+tbc);
    }
    else System.out.println("Không có số nào");

  }
}
