package TruongDH.LyThuyet;

import java.util.Scanner;

public class giaithua {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Mời nhập n= ");
        int n=sc.nextInt();
        int sobd=n;
        //Dùng vòng for
        /*int gt=1;
        for(int i=n;i>=1;i--)
            gt=gt*i;
        System.out.println("Giao thừa của "+n+" bằng "+gt);*/
        //Dùng vòng while
        int gt=1;
        while(n>=1)
        {
            gt=gt*n;
            n--;
        }
        System.out.println("Giai thừa của số "+sobd+" là "+gt);
    }
}