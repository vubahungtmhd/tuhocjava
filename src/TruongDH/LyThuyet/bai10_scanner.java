package TruongDH.LyThuyet;

import java.util.Scanner;

public class bai10_scanner {
    public static void main(String[] args) {
//        //Khoi tao đối tượng scanner
//        Scanner sc=new Scanner(System.in);
//        //Cho phep nhap chuoi
//        System.out.println("Mời nhập vào mật khẩu cấp 1: ");
//        String mk1=sc.nextLine();// Đọc toàn bộ dữ liệu và gán bằng dòng mk1
//        System.out.println("Mk1 la: "+mk1);
//        //Nhập số nguyên
//        System.out.println("Nhập vào 1 số nguyên a: ");
//        int a=sc.nextInt();
//        System.out.println("a= "+a);
//        //Nhap so thuc
//        float b=sc.nextFloat();
//        System.out.println("Nhập vào 1 số thực");
//        System.out.println("b= "+b);
//        //Nhap them 1 chuoi
//        String mk2=sc.nextLine();
//        System.out.println("Nhập mk cấp 2: ");
//        System.out.println("MK Cấp 2: "+mk2);
        //Nhập chuỗi
        System.out.println("Mời nhập tên: ");
        String ten = new Scanner(System.in).nextLine();
        System.out.println("Ten ban la: "+ten);
        //Nhập chuỗi 2
        System.out.println("Nhap gioi tinh: ");
        String gt=new Scanner(System.in).nextLine();
        System.out.println("Gioi tinh la: "+gt);
        //Nhap float
        System.out.println("Hay nhap chieu cao");
        float cao=new Scanner(System.in).nextFloat();
        System.out.println("Chiều cao là: "+cao);
    }
}
