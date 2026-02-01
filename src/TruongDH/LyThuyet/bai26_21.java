package TruongDH.LyThuyet;

import java.util.Scanner;

public class bai26_21 {
  public static void main(String[] args) {
    String a = "abcdefghijklmnopqrstuvwxyz";
    String b = "zxcvbnmasdfghjklqwertyuiop";
    //Nhap doan tin nhan can ma hoa
    Scanner sc = new Scanner(System.in);
    System.out.println("Moi nhap vao tin nhan can ma hoa");
    String input = sc.nextLine();
    //Bien luu tin nhan sau khi duoc ma hoa
    String output = "";
    for (int i = 0; i < input.length(); i++)
    {

      char c=input.charAt(i);
      //Tim vi tri cua ki tu nam trong input
      int index=a.indexOf(c);//tim vi tri cua ki tu cua bien c trong chuoi a
      if(index==-1){
        output+=c;
      }
      else
      { //Neu ki tu tu input co trong bien a thi tu bien b tai vi tri
        //tuong ung cho vao output
        output+=b.charAt(index);
      }
    }
    System.out.println("Tin nhan sau ma hoa la: "+output);
  }
}
