package lab1;

import java.util.Scanner;

public class lab1bai2 {
    public static void main(String[] args) {
        double chieuDai, chieuRong, chuVi, dienTich;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap chieu dai");
        chieuDai=sc.nextDouble();
        System.out.println("Nhap chieu rong");
        chieuRong=sc.nextDouble();
        chuVi=(chieuDai + chieuRong)*2;
        dienTich= chieuDai*chieuRong;
        System.out.println("Chu Vi la: " +chuVi );
        System.out.println("Dien Tich la: " +dienTich);
        System.out.println("Canh Nho Nhat la: " +Math.min(chieuDai, chieuRong));


    }
}
