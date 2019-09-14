package lap2;

import java.util.Scanner;

public class lap2bai2 {
    public static void main(String[] args) {
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
}
