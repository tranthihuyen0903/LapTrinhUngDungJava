package lap2;

import java.util.Scanner;

public class lab2bai4 {
    public static void main(String[] args) {
        System.out.println("+---------------------------------------------------+");
        System.out.println("1. Giải phương trình bậc nhất");
        System.out.println("2. Giải phương trình bậc 2");
        System.out.println("3. Tính tiền điện");
        System.out.println("+---------------------------------------------------+");
        System.out.println("Chọn chức năng: ");
        Scanner sc=new Scanner(System.in);
        int chon=sc.nextInt();
        switch (chon) {
            case 1: giaiPTB1();
                break;
            case 2:  giaiPTB2();
                break;
            case 3: tinhTienDien();
                break;
            default: System.out.println("Không có chức năng này.");
        }
    }

    private static void giaiPTB1() {
        double a, b;
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap so a:");
        a= sc.nextInt();
        System.out.println("Nhap so b:");
        b= sc.nextInt();
        if (a==0){
            if (b==0){
                System.out.println("phuong trinh co VSN");

            }
            else {
                System.out.println("phuong trinh vo nghiem");
            }
        }
        else {
            double x = (-b)/a;
            System.out.println("phuong trinh co nghiem la:" +x);
        }
    }


    private static void giaiPTB2() {
        double a, b, c;
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap so a:");
        a= sc.nextInt();
        System.out.println("Nhap so b:");
        b= sc.nextInt();
        System.out.println("Nhap so c:");
        c= sc.nextInt();
        if (a==0){
            System.out.println("Giai phuong trinh bac nhat");
        }
        else    {
            double delTa = (b*b)-4*a*c;
            double canDelTa= Math.sqrt(delTa);
            if (delTa<0){
                System.out.println("PT VN");
            }
            if (delTa==0){
                System.out.println("PT co nghiem kep x= " + -b/(2*a));
            }
            else{
                System.out.println("PT co 2 nghiem");
                System.out.println("x1="+(-b+canDelTa)/(2*a));
                System.out.println("x1="+(-b-canDelTa)/(2*a));
            }
        }
    }

    private static void tinhTienDien() {
        int soDien;
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap vao so dien");
        soDien= sc.nextInt();
        if (soDien<0){
            System.out.println("So dien phai lon hon 0");
        }
        else {
            if (soDien<=50){
                int tien=soDien*1000;
                System.out.println("So tien dien la: "+tien);
            }
            else {
                int tien= 50*1000 + (soDien - 50)*1200;
                System.out.println("So tien dien la: " +tien);
            }
        }

    }
}

