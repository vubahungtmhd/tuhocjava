package TruongDH.LyThuyet;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bai28_32 {
  public static void main(String[] args) {
    ArrayList<Integer> lstBd=new ArrayList<>(List.of(1,9,3,14,5,27,8));
    ArrayList<Integer> lst=new ArrayList<>(lstBd);//copy mảng
    //Tìm phần tử nhỏ thứ 2 và lớn t2 trong chuỗi
    //Sx mảng tăng dần trước(áp dụng cho list có các phần tử k lặp lại)
    Collections.sort(lst);
    System.out.println(lstBd);
    System.out.println(lst);
    lst.remove(0);
    lst.remove((lst.size()-1));
    System.out.println(lst);
    int max=lst.get(lst.size()-1);
    int min=lst.get(0);
    System.out.println("Phần tử nhỏ thứ 2 là: "+min);
    System.out.println("Phần tử lớn thứ 2 là: "+max);
    for(int i=0;i<lstBd.size();i++)
    {
      if(lstBd.get(i)==min)
        System.out.println("Vị trí của phần tử nhỏ thứ 2 là: "+i);
      else if(lstBd.get(i)==max)
        System.out.println("Vị trí của phần tử lớn thứ 2 là: "+i);
    }
  }

}
