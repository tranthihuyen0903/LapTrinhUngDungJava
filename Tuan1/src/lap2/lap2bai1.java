package lap2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class lap2bai1 {
    public static void main(String[] args) {
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

}
