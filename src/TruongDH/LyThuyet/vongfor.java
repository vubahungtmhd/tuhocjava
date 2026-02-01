package TruongDH.LyThuyet;

public class vongfor {
    public static void main(String[] args) {
        int i,tong=0;
        for(i=0;i<99;i++)
        {
            if(i%2==0)
            {
                tong=tong+i;
            }
        }
        System.out.println("Tong cac so chan: "+tong);
    }
}
