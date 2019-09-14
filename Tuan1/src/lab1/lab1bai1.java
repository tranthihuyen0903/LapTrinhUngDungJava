package lab1;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class lab1bai1 {
    public static void main(String[] args) {
      String hoTen;
      double diemTB;
      Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ho va ten:");
        hoTen=sc.nextLine();
        System.out.println("Nhap Diem:");
       diemTB = sc.nextDouble();
       //System.out.println(hoTen);
        System.out.println(hoTen + " diem: " +  diemTB);
    }
    }

