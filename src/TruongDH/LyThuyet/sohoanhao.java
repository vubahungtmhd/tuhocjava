package TruongDH.LyThuyet;

import java.awt.*;
import java.util.Scanner;

public class sohoanhao {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập n: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            int tong=0;
            for(int k=1;k<=i/2;k++)
            {
                if(i%k==0)
                    tong=tong+k;
            }
            if(tong==i)
                System.out.println(i);
        }
    }
}
