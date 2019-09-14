package lab3;

import java.util.Scanner;

public class lab3bai1 {
    public static void main(String[] args) {
        int N;
        boolean ok = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen to:");
        N = sc.nextInt();
        for(int i=2; i < N-1; i++) { // N là số nhập từ bàn phím
            if (N % i == 0) {
                ok = false;
                break;
            }
        }
        if(ok == true) {
            System.out.println("So da nhap la so nguyen to");
        }
        else
        {
            System.out.println("So da nhap khong phai la so nguyen to");
        }
        }
    }

