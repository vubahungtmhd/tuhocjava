package Enum;

public enum XepLoai {
    gioi("Giỏi"), //0
    kha("Khá"),//1
    tb("Trung bình"),//2
    yeu("Yếu"),//3
    duoiHoc("Đuổi học");//4
    private String msg;
    XepLoai(String msg)
    {
        this.msg=msg;
    }
    public String des()
    {
        return this.msg;
    }
}
