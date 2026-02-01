package TruongDH.LyThuyet;

import java.util.Scanner;

public class breakvacontinue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*
        System.out.println("Mời nhập số n: ");
        int n=sc.nextInt();
        int tong=0;
        for(int i=0;i<=n;i++)
        {

            //if(i==3) continue;
            if(i%2!=0)
            tong=tong+i;
            if(i==3)break;
        }*/
       /* int tong=0;
        int k=10;
        while(k>=10&&k<=50)
        {
            if(k%3==0)
                tong=tong+k;
            k++;
     }*/
        int tong=0;
        int gt;
       /* for(int i=1;i<=10;i++)
        {
            gt=1;
            for(int k=i;k>=1;k--)
            {
                gt=gt*k;
            }
            tong=tong+gt;
        }*/
        gt=1;
        for(int i=1;i<=10;i++)
        {
            gt*=i;
            tong=tong+gt;
        }
        System.out.println(tong);
    }
}
