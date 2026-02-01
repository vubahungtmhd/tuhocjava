package TruongDH.LyThuyet;

import java.util.Scanner;

public class bai13_switch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Mời nhập vào 1 số nguyên: ");
        int a=sc.nextInt();
        //Kiểm tra số dư của a cho 2
        int div=a%2;
        switch (div)
        {
            case 0:
                System.out.println(a+ " là số chẵn");
                break;
            default:
                System.out.println(a+" Là số lẻ");
                break;
        }
    }
}
