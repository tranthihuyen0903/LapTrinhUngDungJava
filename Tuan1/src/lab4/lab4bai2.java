package lab4;

public class lab4bai2 {
    public static void main(String[] args) {
        SanPham sp1=new SanPham();
        SanPham sp2=new SanPham();
        System.out.println("Nhập Thông Tin SP1: ");
        sp1.nhap();
        System.out.println();
        System.out.println("Nhập Thông Tin SP2: ");
        sp2.nhap();
        System.out.println();

        System.out.println("Thông tin SP1: ");
        sp1.xuat();
        System.out.println("--------------");
        System.out.println("Thông tin SP2: ");
        sp2.xuat();
        System.out.println();
    }
}
