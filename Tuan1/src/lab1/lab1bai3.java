package lab1;

import java.util.Scanner;

public class lab1bai3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap canh cua khoi lap phuong:");
        double canh=sc.nextDouble();
        double theTich=canh*canh*canh;
        System.out.println("The Tich la:" +theTich);
    }
}
