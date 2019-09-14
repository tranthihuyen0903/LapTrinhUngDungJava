package lab4;

public class lab4bai3 {
    public static void main(String[] args) {
        SanPham sp1=new SanPham();
        SanPham sp2=new SanPham();
        System.out.println("Nhập Thông Tin SP1: ");
        sp1.nhap();
        System.out.println();
        System.out.println("Nhập Thông Tin SP2: ");
        sp2.nhap();
        System.out.println();
        System.out.println("Sản Phẩm Giảm Giá");
        sp1=new SanPham(sp1.getTenSP(),sp1.getGiaSP(),sp1.getGiamGia());
        sp1.xuat();

        System.out.println("--------------");
        System.out.println("Sản Phẩm Không Giảm Giá");
        sp2=new SanPham(sp2.getTenSP(),sp2.getGiaSP());
        sp2.xuat();
        System.out.println();
    }
}
