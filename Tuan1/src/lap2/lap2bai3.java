package lap2;

import java.util.Scanner;

public class lap2bai3 {
    public static void main(String[] args) {
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
