package TruongDH.LyThuyet;

import java.util.Scanner;

public class bt_tamgiac {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Mời nhập vào bán kính r: ");
        double r= sc.nextDouble();
        double cv=2*Math.PI*r;
        double dt=Math.PI*Math.pow(r,2);//hàm tính số mũ
        //Xuất kết quả
        System.out.println("Chu vi la: "+cv);
        System.out.println("Dien tich la: "+dt);


    }
}
