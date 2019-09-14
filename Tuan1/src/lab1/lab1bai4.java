package lab1;

import java.util.Scanner;

public class lab1bai4 {
    public static void main(String[] args) {
        double a, b, c;
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap so a:");
        a= sc.nextInt();
        System.out.println("Nhap so b:");
        b= sc.nextInt();
        System.out.println("Nhap so c:");
        c= sc.nextInt();
        double delTa= (b*b)-4*a*c;
        double canDelTa= Math.sqrt(delTa);
        System.out.println("delta la" +delTa +"candelta:" +canDelTa);
    }
}
